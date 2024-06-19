package com.telusko.CRMWebAppThymleaf.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.CRMWebAppThymleaf.model.Customer;



@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Integer> 
{

}
