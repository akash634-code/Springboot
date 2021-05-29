package com.api.thymleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	//http://localhost:8080/about
	
	@RequestMapping(value = "/about", method =RequestMethod.GET)
	public String about(Model model)
	{
		
		System.out.println("inside it ");
		model.addAttribute("name", "akash pandey");
		//model.addAttribute("currentDate", new Date().tolocaleString());
		return "about";
	}
	
	//handling iteration
	
	@GetMapping("/exampleofloop")
	public String iterateHandler(Model m)
	{
	List<String> names=	List.of("akash","vikas","sandhya");
	m.addAttribute("names",names);
		return "iterator";
	}
	
	//handle for conditional
	 @GetMapping("/condition")
	public String  forcondi(Model m)
	{
	m.addAttribute("isActive",true);
	m.addAttribute("gender","f");
List<Integer> list=List.of(233,44,34,22);
m.addAttribute("mylist",list);
	return "condition";
}
	 
//handler for including fregement
	 @GetMapping("/service")
	 public String serviceshandler(Model m) {
		 return "service";
	 }
	 @GetMapping("/newabout")
	 public String newabout(Model m) {
		 return "aboutnew";
	 }
	 
}
