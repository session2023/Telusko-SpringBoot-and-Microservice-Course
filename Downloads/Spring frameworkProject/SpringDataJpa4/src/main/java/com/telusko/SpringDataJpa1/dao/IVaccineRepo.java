package com.telusko.SpringDataJpa1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> 
{
  public Vaccine findByVaccineName(String name);
}
