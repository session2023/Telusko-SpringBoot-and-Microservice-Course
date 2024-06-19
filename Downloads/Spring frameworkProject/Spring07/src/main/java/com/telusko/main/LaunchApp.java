package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.config.JavaConfiguration;
import com.telusko.service.GreetMe;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		ApplicationContext container= new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		GreetMe greet=container.getBean(GreetMe.class);
		System.out.println(greet.generateWish("Karthikey Pandey"));
	
	}

}
