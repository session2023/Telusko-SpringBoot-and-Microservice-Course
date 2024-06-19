package com.telusko.SpringDataJpa1;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpa1.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
		
		service.fetchByCostLessThan(2500).forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()));
	}
}
