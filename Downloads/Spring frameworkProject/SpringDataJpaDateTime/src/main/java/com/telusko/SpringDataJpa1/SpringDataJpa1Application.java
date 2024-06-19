package com.telusko.SpringDataJpa1;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpa1.dao.CustomerInfo;
import com.telusko.SpringDataJpa1.service.CustomerServiceImpl;


@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		
		CustomerServiceImpl customerService = container.getBean(CustomerServiceImpl.class);
	
//		CustomerInfo cx=new CustomerInfo("Rohit", "Bengaluru", LocalDateTime.of(1996, 03, 8, 11, 45),
//				LocalTime.now(), LocalDate.of(2016, 4, 8));
//		String msg=customerService.registerCustomer(cx);
//		System.out.println(msg);
		customerService.fetchAllCxInfo().forEach(c->System.out.println(c));
	}

}
