package com.telusko.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.telusko.bean.Employee;

public class LaunchLazyApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Resource resource=new ClassPathResource("applicationconfig.xml");
//		
//		BeanFactory container= new XmlBeanFactory(resource);
		
//		BeanFactory container= new DefaultListableBeanFactory();
		DefaultListableBeanFactory container= new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader read=new XmlBeanDefinitionReader(container);
		
		read.loadBeanDefinitions("applicationconfig.xml");
		read.loadBeanDefinitions("applicationconfig2.xml");
		
		
		
		Employee empBean1 = container.getBean("emp1",Employee.class);
		//String task=empBean1.employeeTask();
		//System.out.println(task);
		System.out.println(empBean1);
		
		System.out.println("***************************************************");
		Employee empBean2 = container.getBean("emp2",Employee.class);
		//String task2=empBean2.employeeTask();
		//System.out.println(task2);
		System.out.println(empBean2);

	}

}
