package com.xyz.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj=(HelloWorld) context.getBean("helloworld");
		System.out.println(obj.getMessage());
		System.out.println(obj.getEmpid());

	}

}