package com.telusko.services;

public class DHL implements DeliveryService {
	
	static
	{
		System.out.println("DHL class loaded");
	}
	
	public DHL()
	{
		System.out.println("DHL bean is created");
	}
	

	public Boolean deliverProduct(Double amount) 
	{
		System.out.println("Product delivered with DHL service and amount paid is : "+ amount);
		return true;
	}

}
