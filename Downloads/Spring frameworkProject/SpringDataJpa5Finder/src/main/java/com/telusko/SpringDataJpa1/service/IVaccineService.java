package com.telusko.SpringDataJpa1.service;

import java.util.Collection;
import java.util.List;

import com.telusko.SpringDataJpa1.dao.Vaccine;
import com.telusko.SpringDataJpa1.view.ResultView;

public interface IVaccineService 
{
	public List<ResultView> fetchByCostLessThan(Integer cost);
}
