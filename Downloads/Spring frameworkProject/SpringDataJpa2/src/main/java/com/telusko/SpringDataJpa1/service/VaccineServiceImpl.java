package com.telusko.SpringDataJpa1.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<Vaccine> getVacccineById(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public String removeVaccineById(Integer id) 
	{
//		Optional<Vaccine> optional = repo.findById(id);
//		if(optional.isPresent())
//		{
//			repo.deleteById(id);
//			return "vaccine details deleted by id "+ id;
//		}
//		
//		
//		return "Vaccine details with given id not found";
		
		Boolean status=repo.existsById(id);
		if(status)
		{
			repo.deleteById(id);
			return "vaccine details deleted by id "+ id;
			
		}
		
		return "Vaccine details with given id not found";
	}

	@Override
	public String remiveVaccinesByIds(List<Integer> ids) {
		List<Vaccine> vaccines = (List<Vaccine>) repo.findAllById(ids);
		int count1=ids.size();
		int count2=vaccines.size();
		if(count1==count2)
		{
			repo.deleteAllById(ids);
			return "Records of given ids are deleted";
		}
		return "Failed to Delete the records";
		
		
	}

	@Override
	public String removeVaccineUsingVaccineObj(Vaccine vaccine) {
		Integer id=vaccine.getId();
		Optional<Vaccine> vac = repo.findById(id);
		
		 if(vac.isPresent())
			{
				repo.delete(vaccine);
				return "vaccine details deleted ";
			}
		 return "Failed to deleted vaccine";
		 
	}
	
	
	

}
