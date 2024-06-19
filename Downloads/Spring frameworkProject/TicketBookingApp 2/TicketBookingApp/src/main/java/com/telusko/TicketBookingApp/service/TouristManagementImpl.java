package com.telusko.TicketBookingApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.TicketBookingApp.dao.ITouristRepo;
import com.telusko.TicketBookingApp.exception.TouristNotFoundException;
import com.telusko.TicketBookingApp.model.Tourist;

@Service
public class TouristManagementImpl implements ITouristManagement 
{

	@Autowired
	private ITouristRepo repo;
	
	@Override
	public String registerTourist(Tourist tourist) 
	{
		Integer id=repo.save(tourist).getTid();
		return "Tourist Info saved  with an ID " + id;
	}

	@Override
	public List<Tourist> fetchAllTourists() {
		
		List<Tourist> list= repo.findAll();
		
//		Collections.shuffle(list);
//		list.
		return list;
	}

	@Override
	public Tourist fetchTouristInfoById(Integer id) 
	{
//		Optional<Tourist> optional = repo.findById(id);
//		Tourist tourist = optional.get();
//		return tourist;
		return repo.findById(id).
				orElseThrow(()->new TouristNotFoundException("Tourist with given id "+ id+ " is Not Found"));
	}

}
