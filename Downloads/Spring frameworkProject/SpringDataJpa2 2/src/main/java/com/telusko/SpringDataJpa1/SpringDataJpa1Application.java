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
//		
//		Vaccine vaccineInfo=new Vaccine("CovidShield", "Astrazenca", 999);
//		
//		String status=service.registerVaccineInfo(vaccineInfo);
//		System.out.println(status);
		
//		Vaccine vaccineInfo1=new Vaccine("Covaxin", "BharatBio", 945);
//		
//		Vaccine vaccineInfo2=new Vaccine("Phizer", "USA", 9994);
//		
//		Vaccine vaccineInfo3=new Vaccine("Sputnik", "Russiam", 45454);
//		
//		List<Vaccine> vaccineList=new ArrayList<Vaccine>();
//		vaccineList.add(vaccineInfo1);
//		vaccineList.add(vaccineInfo2);
//		vaccineList.add(vaccineInfo3);
//		
//		service.registerMultipleVaccines(vaccineList).forEach(v->System.out.println(v));
//		
//		Long count=service.getVaccinesCount();
//		System.out.println("No of vaccines registered : "+ count);
//		
//		Boolean status=service.checkAvailability(5);
//		if(status)
//			System.out.println("Vaccine Available");
//		else
//			System.out.println("Vaccine UnAvailable");
		
//		service.getAllVaccinesInfo().forEach(v->System.out.println(v));
//		List<Vaccine> vaccines=(List<Vaccine>) service.getAllVaccinesInfo();
//		Stream stream=vaccines.stream();
//		stream.forEach(v->System.out.println(v));
		
		List<Integer> ids=new ArrayList<>();
		ids.add(1);
		ids.add(2);
		
		service.getAllVaccinesInfoSpecific(ids).forEach(v->System.out.println(v));
		
		
	}

}
