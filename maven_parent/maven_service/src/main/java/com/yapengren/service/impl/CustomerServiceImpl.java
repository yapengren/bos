package com.yapengren.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yapengren.dao.CustomerDao;
import com.yapengren.domain.Customer;
import com.yapengren.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public Customer findById(int custId) {
		return customerDao.findById(custId);
	}
}
