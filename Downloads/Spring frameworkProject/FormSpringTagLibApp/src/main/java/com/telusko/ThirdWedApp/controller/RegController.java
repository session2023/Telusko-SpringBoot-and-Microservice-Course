package com.telusko.ThirdWedApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RegController 
{

	@GetMapping("/register")
	public String home(@ModelAttribute("impl")Implementer impl)
	{
		return "register";//lvn
	}

	
	@PostMapping("/register")
	public String register(Map<String, Object>model, @ModelAttribute("impl")Implementer impl)
	{
		System.out.println(impl);
		model.put("impl", impl);
		
		return "response";//lvn
	}
}
