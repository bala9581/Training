package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new AnnotationConfigApplicationContext(SpringUtil.class);
		SpringORM s=ac.getBean(SpringORM.class);
		College c=new College();
		//	c.setId(1045);
		//	c.setSname("steve");
		//	c.setSmarks(355);
		//	c.setSection("B");
		//	c.setBranch("ECE");
		//	s.insert(c);
		s.select();
	}

}
