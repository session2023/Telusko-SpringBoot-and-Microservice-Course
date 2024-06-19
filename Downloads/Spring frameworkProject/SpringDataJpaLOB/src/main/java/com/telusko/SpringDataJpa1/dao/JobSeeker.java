package com.telusko.SpringDataJpa1.dao;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class JobSeeker 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String city;
	
	private LocalDate dob;
	
	@Lob
	@Column(length=100000)
	private byte[] image;
	
	@Lob
	private char[] textFile;

	public JobSeeker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobSeeker(Integer id, String name, String city, LocalDate dob, byte[] image, char[] textFile) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.dob = dob;
		this.image = image;
		this.textFile = textFile;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public char[] getTextFile() {
		return textFile;
	}

	public void setTextFile(char[] textFile) {
		this.textFile = textFile;
	}
	
	

}
