package com.telusko.SpringDataJpa1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpa1.dao.Vaccine;
import com.telusko.SpringDataJpa1.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);
		
//		service.fetchDetails(false, "vaccineName","vaccineCompany").
//		forEach(c->System.out.println(c.getVaccineName()+" -> "+c.getVaccineCompany()));;
		
//		service.fetchDetails(0, 4, true, "vaccineName").forEach(c->System.out.println(c.getVaccineName()+" -> "+c.getVaccineCompany()));;
		service.fetchDetailsPagination(2);
	}

}
