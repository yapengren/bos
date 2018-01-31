package com.yapengren.bos.service.dispatch.impl;

import com.yapengren.bos.dao.dispatch.OrderBackDao;
import com.yapengren.bos.domain.base.Courier;
import com.yapengren.bos.domain.base.FixedArea;
import com.yapengren.bos.domain.take_delivery.Order;
import com.yapengren.bos.domain.take_delivery.WorkBill;
import com.yapengren.bos.service.base.impl.CourierServiceImpl;
import com.yapengren.bos.service.dispatch.OrderBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Set;

/**
 * @author renyapeng
 */
@Service
@Transactional
public class OrderBackServiceImpl implements OrderBackService {

    @Autowired
    private OrderBackDao obd;
    
    @Autowired
    private CourierServiceImpl cs;

    /**
     * 分页查询订单列表
     *
     * @param page
     * @param rows
     * @return
     */
    @Override
    public Page<Order> findPageBean(Integer page, Integer rows) {
        return obd.findAll(new PageRequest(page - 1, rows));
    }

    /**
     * 人工调度
     *
     * @param model
     */
    @Override
    public void save(Order model) {
        Courier c = cs.findById(model.getCourier().getId());

        // 创建工单
        WorkBill wb = new WorkBill();
        // 订单状态
        wb.setType("新单");
        // 取件状态
        wb.setPickstate("新单");
        // 工单创建时间
        wb.setBuildtime(new Date());
        // 催单次数
        wb.setAttachbilltimes(0);
        // 备注信息
        wb.setRemark("请轻拿轻放");
        // 指定负责工单的快递员
        wb.setCourier(c);
        // 指定工单所属订单
        wb.setOrder(model);

        // 保存工单
        obd.save(wb);

        //修改订单分单类型为自动分单
        model.setOrderType("自动分单");
        obd.saveAndFlush(model);
    }

}

