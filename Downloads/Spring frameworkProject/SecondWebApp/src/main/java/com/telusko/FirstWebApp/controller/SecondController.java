package com.telusko.FirstWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller2")
public class SecondController 
{
//	@RequestMapping("/welcome3")
	@GetMapping("/welcome2")
	public String displaySomeMessage(Model model)
	{
		System.out.println("Model is implemented by "+ model.getClass().getName());
		model.addAttribute("message", "Focus is the key to master any skills");
		
		return "home";//LVN
	}



}
