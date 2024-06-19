package com.telusko.SpringDataJpa1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpa1.dao.IVaccineRepo;
import com.telusko.SpringDataJpa1.dao.Vaccine;

@Service
public class VaccineServiceImpl implements IVaccineService 
{

	@Autowired
	private IVaccineRepo repo;
	@Override
	public Iterable<Vaccine> fetchDetails(boolean status, String... properties) {
		
		Sort sort = Sort.by(status? Direction.ASC : Direction.DESC, properties);
		
		
		
		return repo.findAll(sort);
		
	}
	@Override
	public List<Vaccine> fetchDetails(int pgNo, int pgSize, boolean status, String... properties) {
		
//		Sort sort = Sort.by(status? Direction.ASC : Direction.DESC, properties);
//		PageRequest.of(pgNo, pgSize, sort);
		
		PageRequest pageable = PageRequest.of(pgNo, pgSize,status? Direction.ASC : Direction.DESC, properties);
		Page<Vaccine> page = repo.findAll(pageable);
		return page.getContent();
	}
	
	@Override
	public void fetchDetailsPagination(int pageSize) 
	{
		long count=4L;
		
		long pagesCount=count/pageSize;  //4/2===> 2   // 12/3---> 4
		pagesCount=count%pageSize==0?pagesCount: ++pagesCount;
		
		//14/5--> 3 // 14/5--> 2.8 --> 3.8
		for(int i=0; i<pagesCount; i++)
		{
			PageRequest pageable = PageRequest.of(i, pageSize);
			Page<Vaccine> page = repo.findAll(pageable);
			System.out.println("Page Number : "+ i);
			page.getContent().forEach(c->System.out.println(c.getVaccineName()+ " : "+c.getVaccineCompany()));
			System.out.println("---------------------------------------------");
		}
		
	}
	
}
