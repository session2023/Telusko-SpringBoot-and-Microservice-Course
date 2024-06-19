package com.telusko.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.telusko.services.DeliveryService;

@Component("amz")
public class Amazon 
{
	@Autowired
	@Qualifier("dhl")
	private DeliveryService service;//field injection
	
	static
	{
		System.out.println("Amazon class loaded");
	}
	
//	@Autowired
//	public Amazon(DeliveryService service)
//	@Autowired
//	public Amazon(@Qualifier("dhl")DeliveryService service)
//	{
//		System.out.println("Injection through Constructor");
//		this.service=service;
//	}
	
	public Amazon()
	{
		System.out.println("Amazon bean is created");
	}

//	@Autowired
//	@Qualifier("bd")
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
