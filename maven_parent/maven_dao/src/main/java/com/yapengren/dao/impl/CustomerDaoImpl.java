package com.yapengren.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.yapengren.dao.CustomerDao;
import com.yapengren.domain.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public Customer findById(int custId) {
		Customer cus = hibernateTemplate.get(Customer.class, custId);
		System.out.println("dao层" + cus);
		return cus;
	}
}
