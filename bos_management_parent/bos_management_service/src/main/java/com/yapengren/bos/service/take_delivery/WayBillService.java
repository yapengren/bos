package com.yapengren.bos.service.take_delivery;

import com.yapengren.bos.domain.take_delivery.WayBill;
import org.springframework.data.domain.Page;

public interface WayBillService {

	Page<WayBill> findPageBean(Integer page, Integer rows);

	Integer save(WayBill model);
}
