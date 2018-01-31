package com.yapengren.bos.dao.dispatch;

import com.yapengren.bos.domain.take_delivery.Order;
import com.yapengren.bos.domain.take_delivery.WorkBill;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author renyapeng
 */
public interface OrderBackDao extends JpaRepository<Order, Integer> {

    void save(WorkBill wb);
}
