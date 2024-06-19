package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.bean.Employee;

public class LaunchApp1 
{

	public static void main(String[] args) 
	{
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");
//		ApplicationContext containe2=new ClassPathXmlApplicationContext("applicationconfig.xml");
	
		Employee empBean1 = container.getBean("emp1",Employee.class);
		String task=empBean1.employeeTask();
		
		System.out.println(task);
		System.out.println(empBean1);
		
		System.out.println("***************************************************");
		Employee empBean2 = container.getBean("emp2",Employee.class);
		String task2=empBean2.employeeTask();
		System.out.println(task2);
		System.out.println(empBean2);
	}

}
