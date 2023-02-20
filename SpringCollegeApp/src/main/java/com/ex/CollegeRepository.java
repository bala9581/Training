package com.ex;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

public class CollegeRepository {
	
	@Autowired
	private SessionFactory sf;
	private Session se;
	private Transaction tx;
	
	public void saveBookApp(BookApp c) {
		se=sf.openSession();
		tx=se.beginTransaction();
		se.save(c);
		tx.commit();
	}
	public void updateBookApp(BookApp c) {
		se=sf.openSession();
		tx=se.beginTransaction();
		se.update(c);
		tx.commit();
	}
	public void deleteBookApp(BookApp c) {
		se=sf.openSession();
		tx=se.beginTransaction();
		se.delete(c);
		tx.commit();
	}
	public List<BookApp> getBookApp(){
		se=sf.openSession();
		Query<BookApp> qr=se.createQuery("from BookApp c");
		List<BookApp> list=qr.list();
		return list;
	} 

}
