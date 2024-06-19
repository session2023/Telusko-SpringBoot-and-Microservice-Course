package com.telusko.CRMWebAppThymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.CRMWebAppThymleaf.dao.ICustomerRepo;
import com.telusko.CRMWebAppThymleaf.model.Customer;



@Service
public class CustomerServiceImpl implements ICustomerService
{

	private ICustomerRepo repo;

	@Autowired
	public void setRepo(ICustomerRepo repo) 
	{
		this.repo = repo;
	}

	@Override
	public List<Customer> getCustomersInfo() 
	{
		
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void registerCustomer(Customer customer) {
		repo.save(customer);
		
	}

	@Override
	public Customer fetchCxById(Integer id) 
	{
		// TODO Auto-generated method stub
		Optional<Customer> optional = repo.findById(id);
		return optional.get();
	}

	@Override
	public void deleteCxById(Integer id) 
	{
		repo.deleteById(id);
		
	}
	
	
}
