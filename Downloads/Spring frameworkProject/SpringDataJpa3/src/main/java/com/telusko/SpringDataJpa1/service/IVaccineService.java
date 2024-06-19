package com.telusko.SpringDataJpa1.service;

import java.util.List;

import com.telusko.SpringDataJpa1.dao.Vaccine;

public interface IVaccineService 
{
    public Iterable<Vaccine> fetchDetails(boolean status, String... properties);
    public List<Vaccine> fetchDetails(int pgNo, int PgSize,boolean status, String... properties);
    
    public void fetchDetailsPagination(int pageSize);
}
