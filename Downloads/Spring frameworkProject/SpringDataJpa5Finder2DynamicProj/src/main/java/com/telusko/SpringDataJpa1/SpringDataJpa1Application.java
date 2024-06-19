package com.telusko.SpringDataJpa1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpa1.service.VaccineServiceImpl;
import com.telusko.SpringDataJpa1.view.ResultView2;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
		
	//	service.fetchByCostLessThan(2500, ResultView3.class).forEach(v->System.out.println(v.getCost()+ " "+ v.getVaccineName()));
		service.fetchByCostLessThan(2500, ResultView2.class).forEach(v->System.out.println(v.getId()+ " "+ v.getVaccineName()));

	}
}
