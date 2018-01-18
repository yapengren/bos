package com.yapengren.dao;

import com.yapengren.domain.Customer;

public interface CustomerDao {

	Customer findById(int custId);

}
