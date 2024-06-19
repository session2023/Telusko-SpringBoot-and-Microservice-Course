package com.telusko.REST1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.REST1.controller.pojo.Alien;

@RestController
@RequestMapping("/api3")
public class AleinsController 
{
	@GetMapping("/getalien")
    public ResponseEntity<Alien> getResponse()
    {
    	Alien alien=new Alien();
    	alien.setId(45);
    	alien.setName("Rohit");
    	alien.setCity("Mumbai");
    	
    	return new ResponseEntity<Alien>(alien, HttpStatus.OK);
    	
    }
	
	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody Alien alien)
	{
		System.out.println(alien);
		String status="Data Stored Successfully";
		return new ResponseEntity<String>(status, HttpStatus.OK);	
	}
}
