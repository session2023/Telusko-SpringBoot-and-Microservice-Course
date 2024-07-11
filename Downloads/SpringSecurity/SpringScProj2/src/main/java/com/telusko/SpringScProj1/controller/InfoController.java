package com.telusko.SpringScProj1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController()
public class InfoController {
	
	
	public List<Student> students = new ArrayList<>(List.of(new Student(1, "Rohan", "Java"), 
    		new Student(2, "Rohan", "Java"), 
    		new Student(3, "Rohan", "Java")
    		));
	
	
	
	@GetMapping("/get-students")
	public List<Student> getAllStudents(){
		
		return students;
	}

	
	
	@GetMapping("/students")
	public String getInfo(){
		
		return "This app is all about student";
	}
	
	@PostMapping("/add-students")
	public String addStudent(@RequestBody Student student){
		
		
		students.add(student);
		
		return "Student is added";
	}

	
	@GetMapping("csrf-toekn")
	public String getCsfrTonek(HttpServletRequest request){
		
		
		
		
		return (String) request.getAttribute("_csrf");
	}

}
