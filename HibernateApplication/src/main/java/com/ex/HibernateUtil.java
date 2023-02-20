package com.ex;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtil {
	
	private static SessionFactory sf;
	public static SessionFactory getSessionFactory() {
		Configuration cf=new Configuration();
		Properties pr=new Properties();
		pr.put(Environment.URL, "com.mysql.cj.jdbc.Driver");
		pr.put(Environment.URL, "jdbc:mysql://localhost:3306/class");
		pr.put(Environment.USER, "root");
		pr.put(Environment.PASS, "bala9581");
		pr.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		pr.put(Environment.SHOW_SQL, "true");
		pr.put(Environment.HBM2DDL_AUTO, "update");
		
		cf.setProperties(pr);
		cf.addAnnotatedClass(College.class);
		StandardServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cf.getProperties()).build();
		sf=cf.buildSessionFactory(sr);
		return sf;
	}

}
