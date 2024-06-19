package com.telusko.SpringBoot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot01Application 
{

	public SpringBoot01Application()
	{
		System.out.println("Mainmethod class bean is also created");
	}
	public static void main(String[] args)
	{
		ApplicationContext container=SpringApplication.run(SpringBoot01Application.class, args);
	    System.out.println(container.getClass().getName());//AnnotationConfigApplicationContext
		System.out.println("No of beans created behind the scene :"+container.getBeanDefinitionCount());
		String beanNames[]=container.getBeanDefinitionNames();
		for(String name:beanNames)
		{
			System.out.print(name + " : ");
		}
		System.out.println();
		Student st = container.getBean(Student.class);
		st.initializeData();
		
		
	
	}

}
