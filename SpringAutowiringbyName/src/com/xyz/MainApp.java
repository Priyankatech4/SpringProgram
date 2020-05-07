package com.xyz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor t1=(TextEditor)ctx.getBean("textEditor");
		t1.spellCheck();

	}

}