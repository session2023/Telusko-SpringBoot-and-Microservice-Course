package com.telusko.main;

import com.telusko.services.DeliveryService;

public class Amazon 
{
	private DeliveryService service;
	
	static
	{
		System.out.println("Amazon class loaded");
	}
	
	public Amazon(DeliveryService service)
	{
		System.out.println("Injection through Constructor");
		this.service=service;
	}
	
	public Amazon()
	{
		System.out.println("Amazon bean is created");
	}

	public void setService(DeliveryService service) 
	{

		System.out.println("Injection through Setter");
		this.service = service;
	}
	
	public Boolean deliverTheProduct(Double amount)
	{
		
		return service.deliverProduct(amount);
		
	}
	
	
	

}
