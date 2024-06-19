package com.telusko.SpringDataJpa1.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	private Integer id;
	
	private Integer age;
	
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(Integer id, Integer age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	
}
