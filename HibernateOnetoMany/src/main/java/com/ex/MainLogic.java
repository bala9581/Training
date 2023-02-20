package com.ex;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Vendor v=new Vendor();
		v.setVid(101);
		v.setVname("Amazon");
		Customer c1=new Customer();
		c1.setCid(201);
		c1.setCname("Bob");
		Customer c2=new Customer();
		c2.setCid(202);
		c2.setCname("Alice");
		
		Set s=new HashSet();
		s.add(c1);
		s.add(c2);
		v.setCustomer(s);	
		se.save(v);
		tx.commit();
	}

}
