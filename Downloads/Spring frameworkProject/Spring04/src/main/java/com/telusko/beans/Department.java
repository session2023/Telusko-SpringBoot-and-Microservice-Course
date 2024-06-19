package com.telusko.beans;

public class Department 
{
	private Integer dpNo;
	
	private String dpName;

	public Department(Integer dpNo, String dpName) {
		super();
		this.dpNo = dpNo;
		this.dpName = dpName;
		System.out.println("Department bean is created");
	}

	@Override
	public String toString() {
		return "Department [dpNo=" + dpNo + ", dpName=" + dpName + "]";
	}
	
	

}
