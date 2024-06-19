package com.telusko.SpringDataJpa1.service;

import java.util.Collection;
import java.util.List;

import com.telusko.SpringDataJpa1.dao.Vaccine;
import com.telusko.SpringDataJpa1.view.ResultView1;
import com.telusko.SpringDataJpa1.view.View;

public interface IVaccineService 
{
	public <T extends View>List<T> fetchByCostLessThan(Integer cost, Class<T> cls);
}
