package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");
          
		Amazon amz=container.getBean(Amazon.class);
		
		Boolean status=amz.deliverTheProduct(444.45);
		if(status)
			System.out.println("Delivered!");
		else
			System.out.println("failed to Delivered");
		
		
	
	}

}
