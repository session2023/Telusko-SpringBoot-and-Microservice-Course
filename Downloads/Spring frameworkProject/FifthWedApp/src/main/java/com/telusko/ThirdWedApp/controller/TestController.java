package com.telusko.ThirdWedApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController 
{

	@GetMapping("/home")
	public String showHomePage()
	{
		return "home";
	}
	
	@GetMapping("/response")
	public String showSomeResponse(Map<String, Object> model)
	{
		String []booksName=new String[] {"Java", "Junit5", "Spring Boot"};
//		for(String name:booksName)
//		{
//			System.out.println(name);
//		}
		System.out.println("Control in method binded with /response ");
		model.put("books", booksName);
		return "response";
	}
}
