package com.telusko.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer //serviceLayer
{
	
	public ServiceLayer()
	{
		System.out.println("ServiceLayer bean is created");
	}
	
	public void disp()
	{
		System.out.println("Logic in Servicelayer");
	}

}
