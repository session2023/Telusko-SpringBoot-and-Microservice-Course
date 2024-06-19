package com.telusko.CRMSpringMVC.service;

import java.util.List;

import com.telusko.CRMSpringMVC.model.Customer;

public interface ICustomerService 
{
    public List<Customer> getCustomersInfo();
    public void registerCustomer(Customer customer);
    public Customer fetchCxById(Integer id);
    public void deleteCxById(Integer id);
    
}
