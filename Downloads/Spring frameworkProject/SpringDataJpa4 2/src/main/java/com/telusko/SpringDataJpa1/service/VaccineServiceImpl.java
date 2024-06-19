package com.telusko.SpringDataJpa1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public List<Vaccine> searchByGivenVaccineInfo(Vaccine vaccine, boolean status, String... params) {
		
		Example<Vaccine> example = Example.of(vaccine);
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, params);
		
		return repo.findAll(example, sort);
		
	}
	
		
	
	
}
