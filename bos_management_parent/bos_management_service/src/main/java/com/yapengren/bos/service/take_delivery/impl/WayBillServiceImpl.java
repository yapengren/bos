package com.yapengren.bos.service.take_delivery.impl;

import com.yapengren.bos.dao.take_delivery.WayBillDao;
import com.yapengren.bos.domain.take_delivery.WayBill;
import com.yapengren.bos.service.take_delivery.WayBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WayBillServiceImpl implements WayBillService {

	@Autowired
	private WayBillDao wbd;

    /**
     * 运单分页列表
     * @param page
     * @param rows
     * @return
     */
    @Override
    public Page<WayBill> findPageBean(Integer page, Integer rows) {
        return wbd.findAll(new PageRequest(page - 1, rows));
    }

    /**
     * 保存运单
     * @param model
     * @return
     */
    @Override
    public Integer save(WayBill model) {
        //调用Dao
        WayBill wayBill = wbd.save(model);
        return wayBill.getId();
    }

}
