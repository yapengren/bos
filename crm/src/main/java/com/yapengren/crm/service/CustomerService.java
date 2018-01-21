package com.yapengren.crm.service;

import java.util.List;

import com.yapengren.crm.domain.Customer;

public interface CustomerService {

	List<Customer> getLinkedCustomers(String fixedAreaId);

	List<Customer> getUnLinkedCustomers();

	void fixedAreaLinkCustomers(String fixedAreaId, Integer[] custIds);

	Customer findByTelephone(String telephone);

	Customer findByEmail(String email);
	
	void save(Customer c);
	
	void active(String email);
	
	Customer findByEmailAndPassword(String email, String password);

}
