package com.telusko.REST1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.REST1.controller.pojo.Alien;

@RestController
@RequestMapping("/api2")
public class AleinsController 
{
	@GetMapping("/getalien")
    public Alien getResponse()
    {
    	Alien alien=new Alien();
    	alien.setId(44);
    	alien.setName("Rohan");
    	alien.setCity("Mumbai");
    	return alien;
    }
}
