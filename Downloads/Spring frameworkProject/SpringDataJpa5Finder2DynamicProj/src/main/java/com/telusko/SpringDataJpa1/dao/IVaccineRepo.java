package com.telusko.SpringDataJpa1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJpa1.view.View;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> 
{
    public <T extends View>List<T> findByCostLessThan(Integer cost, Class<T> cls);
}
