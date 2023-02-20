package com.ex;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.ex")
@EnableWebMvc
public class SpringUtil {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver ir=new InternalResourceViewResolver();
		ir.setPrefix("/WEB-INF/jsp/");
		ir.setSuffix(".jsp");
		return ir;
	}
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://Localhost:3306/bookapp");
		ds.setUsername("root");
		ds.setPassword("bala9581");
		return ds;
	}
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean();
		lsf.setDataSource(getDataSource());
		Properties pr=new Properties();
		pr.put("hibernate.show_sql", "true");
		pr.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
		pr.put("hibernate.hbm2ddl.auto","update");
		lsf.setHibernateProperties(pr);
		lsf.setAnnotatedClasses(BookApp.class);
		return lsf;
	}
	@Bean
	public CollegeRepository getCollegeRepository() {
		CollegeRepository cc=new CollegeRepository();
		return cc;
	}
}
