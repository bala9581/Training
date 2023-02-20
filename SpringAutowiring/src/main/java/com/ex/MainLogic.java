package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Category c=ac.getBean(Category.class);
		System.out.println("Category name="+c.getCategory_name());
		Book bk=c.getBk();
		System.out.println("Id="+bk.getBkid()+" "+bk.getBook_name()+" "+bk.getBook_price()+" "+bk.getBook_author());
		
	}
}
