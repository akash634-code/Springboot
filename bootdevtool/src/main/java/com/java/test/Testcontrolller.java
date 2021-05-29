package com.java.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontrolller {
 
	@RequestMapping("/test")
	@ResponseBody
public String test()
{
	int a=7;
	int b=89;
	return "this is just" + (a+b);
}
}
