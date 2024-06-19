package com.telusko.SpringDataJpa1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpa1.dao.CustomerInfo;
import com.telusko.SpringDataJpa1.dao.ICustomerRepo;

@Service
public class CustomerServiceImpl implements ICustomerService
{

	@Autowired
	private ICustomerRepo repo;
	
	@Override
	public String registerCustomer(CustomerInfo cx) 
	{
		// TODO Auto-generated method stub
		Integer id=repo.save(cx).getCid();
		return "Customer Info registered Successfully! with id : "+ id;
	}

	@Override
	public Iterable<CustomerInfo> fetchAllCxInfo() {
		
		return repo.findAll();
	}

	
	
	
}
