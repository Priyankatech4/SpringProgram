package com.xyz.first;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
	
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		HelloWorld obj=(HelloWorld)factory.getBean("h1");
		System.out.println(obj.getProductid());
		System.out.println(obj.getProductname());

	}

}