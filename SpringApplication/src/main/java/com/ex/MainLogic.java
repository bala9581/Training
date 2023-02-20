package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	private static ApplicationContext ac;

	public static void main(String[] args) {
		ac = new ClassPathXmlApplicationContext("spring.xml");
		College c=ac.getBean(College.class);
		c.show();
	}

}
