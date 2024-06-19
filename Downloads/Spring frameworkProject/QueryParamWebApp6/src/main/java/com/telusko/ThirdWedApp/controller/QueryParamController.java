package com.telusko.ThirdWedApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryParamController 
{

	//localhost:8181/get?name=Srini
	//localhost:8181/get?name=Srini&course=SpringBoot
	@GetMapping("/get")
	public String generateSomeMsg(@RequestParam("name")String n,
			String course,Map<String, Object> model)
	{
		String msg="Hey There! "+n+ " , I hope Youre enjoying the journey of learning "+course;
		
		model.put("msg",msg);
		return "index";
		
	}
}
