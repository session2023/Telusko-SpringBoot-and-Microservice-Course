package com.telusko.SpringBoot01;

import org.springframework.stereotype.Component;

@Component("st")
public class Student 
{
	private String name;
	private Integer id;
	
	public Student()
	{
		System.out.println("Student bean is created");
	}
	
	public void initializeData()
	{
		name="Vishal";
		id=01;
		System.out.println(name + " --> "+ id);
	}

}
