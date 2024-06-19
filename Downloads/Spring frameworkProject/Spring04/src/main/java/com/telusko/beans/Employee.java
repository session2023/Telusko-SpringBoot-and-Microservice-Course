package com.telusko.beans;

public class Employee 
{
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Department depart;
	
	public Employee()
	{
		System.out.println("Employee bean is created");
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setDepart(Department depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", depart=" + depart + "]";
	}
	
	

}
