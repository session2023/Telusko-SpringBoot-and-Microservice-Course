package com.telusko.SpringDataJpa1;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpa1.dao.IStudentRepo;
import com.telusko.SpringDataJpa1.dao.Student;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa1Application.class, args);
		IStudentRepo repo = container.getBean(IStudentRepo.class);
		
		System.out.println("implementation class of Repo : "+ repo.getClass().getName());
//		Student st=new Student(3, 18, "Rajat");
//		
//		Student st2=repo.save(st);
//		System.out.println(st2);
		
	//	System.out.println(repo.count());//3 --> number of records in the table
		
//		repo.deleteById(1);
//		System.out.println("Deleted record with id 1");
		
		
//		Iterable<Student> records = repo.findAll();
//		Iterator<Student> iterator = records.iterator();
//		while(iterator.hasNext())
//		{
//			Student s=iterator.next();
//			System.out.println(s);
//		}
		
		repo.findAll().forEach(s->System.out.println(s));
		
		Integer id=3;
		Boolean status=repo.existsById(id);
		System.out.println("Record with id "+id +" Present? ->"+ status);
		
	}

}
