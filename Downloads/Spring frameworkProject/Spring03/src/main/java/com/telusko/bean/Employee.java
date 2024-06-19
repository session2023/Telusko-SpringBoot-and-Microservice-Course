package com.telusko.bean;

public class Employee 
{
	
	private Integer id;
	
	private String name;
	
	private Double salary;
	
	private String addr;
	
	static
	{
		System.out.println("Employee class loaded");
	}

//	public Employee() 
//	{
//		super();
//		System.out.println("Employee Bean is created..");
//	}

	public Employee(Integer id, String name, Double salary, String addr) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addr = addr;
		System.out.println("Param Emplyee Constructor");
	}
	
	
	public String employeeTask()
	{
		return "Every Employee acts productive but in reality all of them are less productive";
	}


	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
	}
	
	
	

}
