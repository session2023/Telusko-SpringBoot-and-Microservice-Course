package com.telusko.services;

import org.springframework.stereotype.Service;

@Service("fedEx")
public class FedEx implements DeliveryService {

	static
	{
		System.out.println("FedEx class loaded");
	}
	
	public FedEx()
	{
		System.out.println("FedEx bean is created");
	}
	
	public Boolean deliverProduct(Double amount) 
	{
		System.out.println("Product delivered with FedEx service and amount paid is : "+ amount);
		return true;
	}

}
