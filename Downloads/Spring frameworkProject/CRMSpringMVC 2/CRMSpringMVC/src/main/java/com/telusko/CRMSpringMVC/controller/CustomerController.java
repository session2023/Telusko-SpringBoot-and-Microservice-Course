package com.telusko.CRMSpringMVC.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.CRMSpringMVC.model.Customer;
import com.telusko.CRMSpringMVC.service.ICustomerService;

@Controller
public class CustomerController 
{
	
	private ICustomerService service;

	@Autowired
	public void setService(ICustomerService service) 
	{
		this.service = service;
	}
	
	@GetMapping("/cxlist")
	public  String getCustomerData(Model model)
	{
		List<Customer> customerlist = service.getCustomersInfo();
		model.addAttribute("customers", customerlist);
		customerlist.forEach(c->System.out.println(c));
		return "customerlist";//LVN
	}
	
	@GetMapping("/showForm")
	public String getForm(Map<String, Object> model)
	{
		Customer c=new Customer();
		model.put("customer", c);
		return "showform";
		
	}
	
	@PostMapping("/registerCustomer")
	public String registerCx(@ModelAttribute("customer")Customer customer,Map<String, Object> model)
	{
		service.registerCustomer(customer);
		return "redirect:/cxlist";
		//return "customerlist";
		
	}
	
	

}
