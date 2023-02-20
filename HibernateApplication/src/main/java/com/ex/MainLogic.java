package com.ex;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class MainLogic {

	public static void main(String[] args) {
		 
		Session se=HibernateUtil.getSessionFactory().openSession();
		//Transaction tx=se.beginTransaction();
		
		Query qr=se.createQuery("select c.sid,c.sname,c.smarks from College c where c.sid=(:x,:y)");
		qr.setParameter("x", 1029);
		qr.setParameter("y", 1023);
		List li=qr.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			Object[] o= (Object[])i.next();
			//System.out.println(o.intValue());
			System.out.println(o[0]+" "+o[1]+" "+o[2]);
			//System.out.println(c.getSid()+" "+c.getSname()+" "+c.getSection()+" "+c.getSmarks()+" "+c.getBranch());
		}
		
	}

}
  