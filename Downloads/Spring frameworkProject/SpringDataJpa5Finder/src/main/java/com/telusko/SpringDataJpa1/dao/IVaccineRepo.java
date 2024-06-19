package com.telusko.SpringDataJpa1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJpa1.view.ResultView;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> 
{
    public List<ResultView>findByCostLessThan(Integer cost);
}
