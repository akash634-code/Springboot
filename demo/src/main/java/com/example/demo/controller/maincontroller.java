package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class maincontroller {
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("this is eclipse");
		return "home";
	}
}
