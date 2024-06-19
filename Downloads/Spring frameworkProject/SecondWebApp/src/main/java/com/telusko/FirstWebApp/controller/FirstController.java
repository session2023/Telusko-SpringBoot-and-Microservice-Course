package com.telusko.FirstWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/controller1")
public class FirstController
{

//	@RequestMapping(value="/welcome2", method=RequestMethod.GET)
//	@RequestMapping("/welcome2")
//	@GetMapping("/welcome2")
	@PostMapping("/welcome2")
	public String displaySomeMessage1(Model model)
	{
		System.out.println("Model is implemented by "+ model.getClass().getName());
		model.addAttribute("message", "Welcome Back Aliens! My Name is Navin Reddy!");
		
		return "home";//LVN
	}
	@GetMapping("/welcome2")
	public String displaySomeMessage2(Model model)
	{
		System.out.println("Model is implemented by "+ model.getClass().getName());
		model.addAttribute("message", "Welcome Back Aliens! My Name is Navin Reddy! In This Video we will learn about web app");
		
		return "home";//LVN
	}
	
	@GetMapping("/alien")
	public String displaySomeMessage3(Map<String, Object> map)
	{
		System.out.println("Model is implemented by "+ map.getClass().getName());
	    map.put("key","I hope you're learning well at Telusko");
		
		return "course";//LVN
	}
	
//	@GetMapping("/home")
//	public void displaySomeMessage4(Map<String, Object> map)
//	{
//		
//	    map.put("message","Shape Your Skills, Shape Your Success");
//	   
//		
//		
//	}
}
