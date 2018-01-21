package com.yapengren.bos.dao.take_delivery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yapengren.bos.domain.take_delivery.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {

}
