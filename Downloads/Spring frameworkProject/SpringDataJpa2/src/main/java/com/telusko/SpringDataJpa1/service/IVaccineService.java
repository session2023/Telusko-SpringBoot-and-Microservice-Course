package com.telusko.SpringDataJpa1.service;

import java.util.List;
import java.util.Optional;

import com.telusko.SpringDataJpa1.dao.Vaccine;

public interface IVaccineService 
{
     public String registerVaccineInfo(Vaccine vaccineInfo);
     public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
     public Long getVaccinesCount();
     public Boolean checkAvailability(Integer id);
     public Iterable<Vaccine> getAllVaccinesInfo();
     public Iterable<Vaccine> getAllVaccinesInfoSpecific(Iterable<Integer> ids);
     public Optional<Vaccine> getVacccineById(Integer id);
     public String removeVaccineById(Integer id);
     public String remiveVaccinesByIds(List<Integer> ids);
     public String removeVaccineUsingVaccineObj(Vaccine vaccine);
}
