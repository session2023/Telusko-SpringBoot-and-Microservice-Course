package com.telusko.SpringDataJpa1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpa1.dao.IVaccineRepo;
import com.telusko.SpringDataJpa1.dao.Vaccine;

@Service
public class VaccineServiceImpl implements IVaccineService 
{

	@Autowired
	private IVaccineRepo repo;
	
	@Override
	public String registerVaccineInfo(Vaccine vaccineInfo) 
	{
		Vaccine vaccine = repo.save(vaccineInfo);
		
		return "Vaccine with id "+ vaccine.getId()+ " successfully";
	}

	@Override
	public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines) 
	{
		return repo.saveAll(vaccines);
		
	
	}

	@Override
	public Long getVaccinesCount() {
		
		return repo.count();
	}

	@Override
	public Boolean checkAvailability(Integer id) {
		return repo.existsById(id);
		
	}

	@Override
	public Iterable<Vaccine> getAllVaccinesInfo() {
		return repo.findAll();
	}

	@Override
	public Iterable<Vaccine> getAllVaccinesInfoSpecific(Iterable<Integer> ids)
	{
		return repo.findAllById(ids);
		
	}

}
