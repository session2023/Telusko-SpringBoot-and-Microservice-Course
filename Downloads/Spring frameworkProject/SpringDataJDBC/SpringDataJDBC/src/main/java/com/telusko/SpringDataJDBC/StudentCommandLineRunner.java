package com.telusko.SpringDataJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.SpringDataJDBC.dao.CourseDetails;
import com.telusko.SpringDataJDBC.dao.SpringJdbc;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {

	@Autowired
	private SpringJdbc jdbc;
	
	@Override
	public void run(String... args) throws Exception 
	{
		// TODO Auto-generated method stub
		//jdbc.insert();
		CourseDetails cd=new CourseDetails(1, "SBM");
		jdbc.insert(cd);
		jdbc.delete(1);

	}

}
