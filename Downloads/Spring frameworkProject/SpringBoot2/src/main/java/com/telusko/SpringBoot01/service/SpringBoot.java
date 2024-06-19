package com.telusko.SpringBoot01.service;

import org.springframework.stereotype.Service;

@Service
public class SpringBoot implements Courses 
{
	
	public SpringBoot()
	{
		System.out.println("SB bean is created");
	}

	@Override
	public Boolean getTheCourse(Double amount) 
	{
		System.out.println("SpringBoot Course is purchased");
		return true;
	}

}
