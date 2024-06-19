package com.telusko.SpringDataJpa1;

import java.util.ArrayList;
import java.util.List;

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
		
//		Vaccine vaccineInfo1=new Vaccine("Covaxin", "BharatBio", 945);
//		service.searchByGivenVaccineInfo(vaccineInfo1, true, "vaccineName")
//		.forEach(c->System.out.println(c.getVaccineName()+ " : "+c.getVaccineCompany()));
//		System.out.println(service.searchVaccineById(102));
		
//		Vaccine vaccineInfo1=new Vaccine("Covaxin", "BharatBio", 945);
//		service.searchVaccineByObject(vaccineInfo1).forEach(v->System.out.println(v));
		
		List<Integer> ids =new ArrayList<>();
		ids.add(53);
		ids.add(103);
		String status=service.removeVaccineInfoByIds(ids);
		System.out.println(status);
	}

}
