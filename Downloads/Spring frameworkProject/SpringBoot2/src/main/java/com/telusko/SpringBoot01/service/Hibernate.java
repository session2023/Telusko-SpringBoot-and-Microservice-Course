package com.telusko.SpringBoot01.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Hibernate implements Courses 
{

	public Hibernate()
	{
		System.out.println("HB bean is created");
	}
	
	@Override
	public Boolean getTheCourse(Double amount) 
	{
		System.out.println("Hibernate Course is purchased");
		return true;
	}

}
