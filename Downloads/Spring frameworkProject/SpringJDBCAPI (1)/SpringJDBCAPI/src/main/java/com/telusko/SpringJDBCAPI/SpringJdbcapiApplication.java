package com.telusko.SpringJDBCAPI;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.SpringJDBCAPI.dao.Employee;
import com.telusko.SpringJDBCAPI.dao.EmployeeDAOImpl;

@SpringBootApplication
public class SpringJdbcapiApplication 
{

	public static void main(String[] args) 
	{
		ApplicationContext container=SpringApplication.run(SpringJdbcapiApplication.class, args);
	
		EmployeeDAOImpl dao = container.getBean(EmployeeDAOImpl.class);
		
//		List<Employee> employessData = dao.getEmployeesData();
//		Iterator<Employee> itr = employessData.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		dao.getEmployeesData().forEach(e->System.out.println(e));
		
		
	
	
	}

}
