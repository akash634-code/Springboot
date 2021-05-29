package com.springcoreTesting1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student =context.getBean("getStudent",Student.class);
		student.study();

	}

	

}
