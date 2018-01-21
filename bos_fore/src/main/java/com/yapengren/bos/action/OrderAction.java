package com.yapengren.bos.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.yapengren.bos.service.take_delivery.impl.Area;
import com.yapengren.bos.service.take_delivery.impl.Order;
import com.yapengren.bos.service.take_delivery.impl.OrderServiceImpl;
import com.yapengren.bos.utils.action.BaseAction;

@Results({
	@Result(name="toIndex", type="redirect", location="/index.html")
	})
public class OrderAction extends BaseAction<Order> {
	
	@Autowired
	private OrderServiceImpl os;
	
	//寄件人区域信息
	//北京市/北京市/海淀区
	private String sendAreaStr;
	
	//收件人区域
	private String recAreaStr;
	
	@Action("OrderAction_add")
	public String add() {
		//切割省市区
		String[] sendAreaArr = sendAreaStr.split("/");
		
		//封装到Area 对象中
		Area sendArea = new Area();
		sendArea.setProvince(sendAreaArr[0]);
		sendArea.setCity(sendAreaArr[1]);
		sendArea.setDistrict(sendAreaArr[2]);
		
		//将area 放入订单
		model.setSendArea(sendArea);
		
		//==============================
		//切割省市区
		String[] recAreaArr = recAreaStr.split("/");
		
		//封装到Area对象中
		Area recArea = new Area();
		recArea.setProvince(recAreaArr[0]);	
		recArea.setCity(recAreaArr[1]);	
		recArea.setDistrict(recAreaArr[2]);	
		
		//将area放入订单
		model.setRecArea(recArea);
		
		//保存订单
		os.save(model);
		
		//下单后返回首页
		return "toIndex";
	}

	public String getSendAreaStr() {
		return sendAreaStr;
	}

	public void setSendAreaStr(String sendAreaStr) {
		this.sendAreaStr = sendAreaStr;
	}

	public String getRecAreaStr() {
		return recAreaStr;
	}

	public void setRecAreaStr(String recAreaStr) {
		this.recAreaStr = recAreaStr;
	}
}
