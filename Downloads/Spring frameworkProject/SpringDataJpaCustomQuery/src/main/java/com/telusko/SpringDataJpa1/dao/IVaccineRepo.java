package com.telusko.SpringDataJpa1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> 
{
  
//	@Query("FROM Vaccine WHERE vaccineCompany=:company")
//	public List<Vaccine> searchByVaccineCompanyName(String company);
	
	@Query("FROM Vaccine WHERE vaccineCompany=:company")
	public List<Vaccine> searchByVaccineCompanyName(@Param("company")String c);
	
	@Query("FROM Vaccine WHERE vaccineCompany IN(:comp1, :comp2)")
	public List<Vaccine> searchByVaccineCompanyName(String comp1, String comp2);
	
	@Query("SELECT vaccineName,vaccineCompany FROM Vaccine WHERE cost BETWEEN :minP AND :maxP")
	public List<String> searchByVaccinePriceRange(Integer minP, Integer maxP);
	
	@Query("SELECT vaccineCompany, cost FROM Vaccine WHERE vaccineName IN(:vac1, :vac2)")
	public List<Object[]> searchVaccineInfoByVaccineName(String vac1,String vac2);
	
	@Transactional
	@Modifying
	@Query("UPDATE Vaccine SET cost=:newCost WHERE vaccineName=:vac")
	public int updatePriceByVaccineName(Integer newCost,String vac);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Vaccine WHERE cost BETWEEN :minP AND :maxP")
	public int deleteByVaccinePriceRange(Integer minP, Integer maxP);
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO vaccine_info(`id`,`vaccine_name`,`vaccine_company`,`cost`) Values(?,?,?,?)", nativeQuery=true)
	public int insertVaccineDetails(Integer id,String vaccineName, String vaccineCompany, Integer cost);
	
	
	
}
