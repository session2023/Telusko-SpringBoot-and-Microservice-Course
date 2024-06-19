package com.telusko.services;

import org.springframework.stereotype.Service;

@Service("bd")
public class BlueDart implements DeliveryService {

	static
	{
		System.out.println("BlueDart class loaded");
	}
	
	public BlueDart()
	{
		System.out.println("BlueDart bean is created");
	}
	
	public Boolean deliverProduct(Double amount) 
	{
		System.out.println("Product delivered with BlueDart service and amount paid is : "+ amount);
		return true;
	}
	
	

}
