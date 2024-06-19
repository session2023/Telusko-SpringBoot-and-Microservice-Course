package com.telusko.REST1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class GreetingController 
{
	
	@GetMapping("/welcome")
   public  String getWelcomeMsg()
   {
		String body="Hello! Welcome Back Aliens";
		return body;
   }
	
		@GetMapping("/welcome2")
	   public  String getResponse(@RequestParam(value="name",required=false, 
	   defaultValue="Navin")String name)
	   {
			String body="Hello!" + name+ " Welcome Back to Spring classes";
			return body;
	   }
		
		@GetMapping("/welcome3/{name}")
		   public  String getResponse2(@PathVariable(value="name",required=false)String name)
		   {
				String body="Hello!" + name+ " Welcome Back to Spring REST classes";
				return body;
		   }
}
