package com.telusko.SpringDataJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJDBC.dao.SpringJdbc;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcApplication.class, args);
//	
//		SpringJdbc jdbc = context.getBean(SpringJdbc.class);
//		
//		jdbc.insert();
	}

}
