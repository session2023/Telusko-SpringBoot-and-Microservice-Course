package com.telusko.SpringDataJpa1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpa1.dao.IJobRepo;
import com.telusko.SpringDataJpa1.dao.JobSeeker;

@Service
public class JobServiceImpl implements IJobService 
{

	@Autowired
	private IJobRepo repo;
	
	@Override
	public String registerJobSeeker(JobSeeker job) 
	{
		Integer id=repo.save(job).getId();
		return "JobSeeker info is registered with id : "+ id;
	}

	@Override
	public Optional<JobSeeker> searchJobSeekerInfoById(Integer id) {
		
		return repo.findById(id);
	}

}
