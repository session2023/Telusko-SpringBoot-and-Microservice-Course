package com.telusko.SpringDataJpa1.service;

import java.util.List;

import com.telusko.SpringDataJpa1.dao.Vaccine;

public interface IVaccineService 
{
   public List<Vaccine> searchByGivenVaccineInfo(Vaccine vaccine, boolean status, String... params);
   public Vaccine searchVaccineById(Integer id);
   public List<Vaccine> searchVaccineByObject(Vaccine vaccine);
   public String removeVaccineInfoByIds(Iterable<Integer>ids);
}
