package com.telusko.SpringDataJpa1.service;

import java.util.Optional;

import com.telusko.SpringDataJpa1.dao.JobSeeker;

public interface IJobService 
{
	public String  registerJobSeeker(JobSeeker job);
	public Optional<JobSeeker> searchJobSeekerInfoById(Integer id);

}
