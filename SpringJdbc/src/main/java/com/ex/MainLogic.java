package com.ex;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringUtil.class);
		SpringDao s=(SpringDao)ac.getBean("dao");
		//s.insert();
		//s.delete();
		s.select();
		
	}

}
