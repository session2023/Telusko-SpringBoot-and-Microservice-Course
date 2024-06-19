package com.telusko.SpringDataJpa1.service;

import java.util.Collection;
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
	public List<Vaccine> fetchByVaccineCompanyName(String c) {
		
		return repo.searchByVaccineCompanyName(c);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompanyName(String comp1, String comp2) {
		
		return repo.searchByVaccineCompanyName(comp1, comp2);
	}

	@Override
	public List<String> fetchByVaccinePriceRange(Integer minP, Integer maxP) {
		
		return repo.searchByVaccinePriceRange(minP, maxP);
	}

	@Override
	public List<Object[]> fetchVaccineInfoByVaccineName(String vac1, String vac2) {
		
		return repo.searchVaccineInfoByVaccineName(vac1, vac2);
	}

	@Override
	public int updateThePriceByVaccineName(Integer newCost, String vac) {
		
		return repo.updatePriceByVaccineName(newCost, vac);
	}

	@Override
	public int deleteTheVaccineByPriceRange(Integer minP, Integer maxP) {
		
		return repo.deleteByVaccinePriceRange(minP, maxP);
	}

	@Override
	public int insertVaccineInfo(Integer id,String vaccineName, String vaccineCompany, Integer cost) {
		
		return repo.insertVaccineDetails(id,vaccineName, vaccineCompany, cost);
	}


	

}
