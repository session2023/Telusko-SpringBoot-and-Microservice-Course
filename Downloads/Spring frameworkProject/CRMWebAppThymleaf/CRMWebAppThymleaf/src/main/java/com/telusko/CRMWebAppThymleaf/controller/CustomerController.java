package com.telusko.CRMWebAppThymleaf.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.CRMWebAppThymleaf.model.Customer;
import com.telusko.CRMWebAppThymleaf.service.ICustomerService;

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
	
	@GetMapping("/updateForm")
	public String updateCxInfo(@RequestParam("customerId")Integer id,Map<String, Object> model)
	{
		System.out.println("uodate form ");
		Customer cx = service.fetchCxById(id);
		System.out.println(cx);
		model.put("customer", cx);
		return "showform";
	}
	
	@GetMapping("/deleteData")
	public String deleteCx(@RequestParam("customerId")Integer id)
	{
		service.deleteCxById(id);
		return "redirect:/cxlist";
	}
	
	
	

}
