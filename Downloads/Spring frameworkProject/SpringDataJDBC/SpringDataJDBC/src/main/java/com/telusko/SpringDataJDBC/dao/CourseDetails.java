package com.telusko.SpringDataJDBC.dao;

public class CourseDetails 
{
	private Integer cid;
	private String cname;
	
	public CourseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public CourseDetails(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}


	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	

}
