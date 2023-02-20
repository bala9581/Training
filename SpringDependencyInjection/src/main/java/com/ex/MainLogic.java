package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	private static ApplicationContext ac;

	public static void main(String[] args) {
		ac = new ClassPathXmlApplicationContext("spring.xml");
		Journey c=ac.getBean(Travel.class);
		c.startJourney();
	}

}
