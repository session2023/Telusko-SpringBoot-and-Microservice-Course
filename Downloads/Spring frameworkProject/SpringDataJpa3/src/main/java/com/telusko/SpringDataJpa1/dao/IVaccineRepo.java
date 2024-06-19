package com.telusko.SpringDataJpa1.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> 
{

}
