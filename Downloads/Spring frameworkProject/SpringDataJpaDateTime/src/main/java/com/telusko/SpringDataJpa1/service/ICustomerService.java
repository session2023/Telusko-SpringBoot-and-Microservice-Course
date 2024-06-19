package com.telusko.SpringDataJpa1.service;

import com.telusko.SpringDataJpa1.dao.CustomerInfo;

public interface ICustomerService 
{

	public String registerCustomer(CustomerInfo cx);
	public Iterable<CustomerInfo> fetchAllCxInfo();
}
