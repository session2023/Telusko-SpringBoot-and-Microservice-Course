package com.telusko.SpringDataJpa1;

import java.util.Collection;
import java.util.HashSet;
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

//		service.fetchByVaccineCompanyName("Astrazenca").forEach(v->System.out.println(v));
//		System.out.println("**********************************");
//		service.fetchByVaccineCompanyName("Astrazenca", "BharatBio").forEach(v->System.out.println(v));
//	System.out.println("*********************************");
//		List<String> list = service.fetchByVaccinePriceRange(500, 2500);
//	//	System.out.println(list);
//		list.forEach(v->System.out.println(v));
		
//		List<Object[]> vaccineInfo = service.fetchVaccineInfoByVaccineName("CovidShield", "Phizer");
//	
//		for(Object[] objects:vaccineInfo)
//		{
//			for(Object vaccine:objects)
//			{
//				System.out.print(vaccine+ " ");
//			}
//			System.out.println();
//		}
		
//		int rowsAffected=service.updateThePriceByVaccineName(4545, "Covaxin");
//		System.out.println("Num of records updated: "+ rowsAffected);
//		int rowsAffected=service.deleteTheVaccineByPriceRange(500, 1500);
//		System.out.println("Num of records Deleted: "+ rowsAffected);
		int rowsInserted=service.insertVaccineInfo(44,"Covaxin", "BharatBio", 45454);
		System.out.println("Number of rows inserted : "+ rowsInserted);
	}

}
