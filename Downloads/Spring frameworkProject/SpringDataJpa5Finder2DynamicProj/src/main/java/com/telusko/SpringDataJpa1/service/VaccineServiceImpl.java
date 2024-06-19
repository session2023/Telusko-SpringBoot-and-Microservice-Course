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
import com.telusko.SpringDataJpa1.view.ResultView1;
import com.telusko.SpringDataJpa1.view.View;

@Service
public class VaccineServiceImpl implements IVaccineService 
{

	@Autowired
	private IVaccineRepo repo;

	@Override
	public <T extends View>List<T> fetchByCostLessThan(Integer cost, Class<T> cls) {
		// TODO Auto-generated method stub
		return repo.findByCostLessThan(cost, cls);
	}


	

}
