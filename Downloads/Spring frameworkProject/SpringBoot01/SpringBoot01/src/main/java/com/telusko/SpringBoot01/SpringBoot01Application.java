package com.telusko.SpringBoot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot01Application 
{

	public static void main(String[] args)
	{
		ApplicationContext container=SpringApplication.run(SpringBoot01Application.class, args);
	
		
		Student st = container.getBean(Student.class);
		st.initializeData();
	
	}

}
