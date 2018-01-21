package com.yapengren.bos.service.take_delivery.impl;

import java.util.Date;
import java.util.Set;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yapengren.bos.dao.base.AreaDao;
import com.yapengren.bos.dao.base.FixedAreaDao;
import com.yapengren.bos.dao.take_delivery.OrderDao;
import com.yapengren.bos.dao.take_delivery.WorkBillDao;
import com.yapengren.bos.domain.base.Area;
import com.yapengren.bos.domain.base.Courier;
import com.yapengren.bos.domain.base.FixedArea;
import com.yapengren.bos.domain.base.SubArea;
import com.yapengren.bos.domain.take_delivery.Order;
import com.yapengren.bos.domain.take_delivery.WorkBill;
import com.yapengren.bos.service.take_delivery.OrderService;
import com.yapengren.crm.service.impl.Customer;
import com.yapengren.crm.service.impl.CustomerServiceImpl;

@Service("orderService")
@Transactional
@WebService
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao od;
	
	@Autowired
	private AreaDao ad;
	
	@Autowired
	private CustomerServiceImpl cs;
	
	@Autowired
	private FixedAreaDao fad;
	
	@Autowired
	private WorkBillDao wbd;
	
	/* 
	 * Title: save 
	 * Description: 
	 * @param o  
	 * @see com.yapengren.bos.service.take_delivery.OrderService#save(com.yapengren.bos.domain.take_delivery.Order)  
	 */  
	@Override
	public void save(Order o) {
		o.setOrderType("自动分单");
		
		//处理关联的区域
		//根据省市区信息，查询Area 对象
		Area sendArea = ad.findByProvinceAndCityAndDistrict(o.getSendArea().getProvince(), o.getSendArea().getCity(), o.getSendArea().getDistrict());
		Area recArea = ad.findByProvinceAndCityAndDistrict(o.getRecArea().getProvince(), o.getRecArea().getCity(), o.getRecArea().getDistrict());
		
		//放入Order 中表达关系
		o.setSendArea(sendArea);
		o.setRecArea(recArea);
		
		//保存订单
		od.save(o);
		
		//生成订单
		//按照客户 => 定区 => 快递员 => 工单
		//调用CustomerService 根据详细地址找客户
		Customer c = cs.findByAddress(o.getSendAddress());
		
		if (c != null) {
			//根据客户查找定区
			FixedArea fixedArea = fad.findOne(c.getFixedAreaId());
			generateWorkBill(o, fixedArea);
		} else {
			//取出取件区域下属的分区
			Set<SubArea> subAreas = sendArea.getSubareas();
			
			//使用分区中的关键字从详细地址中查找对应 => 找到取件地址所在分区
			SubArea subArea = null;
			for (SubArea sa : subAreas) {
				if (o.getSendAddress().contains(sa.getKeyWords()) || o.getSendAddress().contains(sa.getAssistKeyWords())) {
					subArea = sa;
					break;
				}
			}
			
			//判断是否找到分区
			if (subArea != null) {
				//找到 => 按照区域 -> 分区 -> 定区 -> 快递员 -> 工单
				//根据分区找到定区
				FixedArea fixedArea = subArea.getFixedArea();
				//根据定区生成工单
				generateWorkBill(o, fixedArea);
			} else {
				//未找到 => 手动分单
				o.setOrderType("手动分单");
			}
		}
	}

	/**  
	 * @Title: generateWorkBill  
	 * @Description: TODO 根据定区生成工单
	 * @param @param o
	 * @param @param fixedArea
	 * @return void
	 * @throws  
	 */  
	private void generateWorkBill(Order o, FixedArea fixedArea) {
		//根据定区找快递员
		Set<Courier> couriers = fixedArea.getCouriers();
		
		//取出快递员生成工单
		Courier courier = couriers.iterator().next();
		
		//创建工单
		WorkBill wb = new WorkBill();
		wb.setType("新单");    //订单状态
		wb.setPickstate("新单");    //取件状态
		wb.setBuildtime(new Date());    //工单创建时间
		wb.setAttachbilltimes(0);    //催单次数
		wb.setRemark("请轻拿轻放");    //备注信息
		wb.setCourier(courier);    //指定负责工单的快递员
		wb.setOrder(o);    //指定工单所属订单
		
		//保存工单
		wbd.save(wb);
	}
	
}
