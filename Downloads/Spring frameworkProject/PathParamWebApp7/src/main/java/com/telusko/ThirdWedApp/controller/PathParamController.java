package com.telusko.ThirdWedApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParamController 
{
	
  //localhost:8181/getmessage/Rajesh
	@GetMapping("/getmessage/{name}/{course}")
	public String getSomeMsg(@PathVariable("name")String n,@PathVariable("course")String c
			,Map<String, Object> model)
	{
		String msg="Hey, "+ n+ " You can join our live "+ c+ " course in future";
		model.put("msg", msg);
		return "index";
	}
}
