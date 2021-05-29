package com.springcoreTesting1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.springcoreTesting1") // incase of component annotation
public class JavaConfig {
	
	@Bean
	public Student getStudent() {
		Student st=new Student();
		return st;
	}

}
