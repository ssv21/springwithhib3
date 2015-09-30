package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	
	public static void main(String[] args) {
		
		System.out.println("bean creation");
		
		ApplicationContext apcon =new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("bean started");
		
		AbcDAO abc	=(AbcDAO)apcon.getBean("spring.xml");
		abc.Save();
		
	}

}
