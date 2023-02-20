package com.ex;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CollegeController {
	
	@Autowired
	private SessionFactory sf;
	private Session se;
	private Transaction tx;
	

	@RequestMapping("/addcollege")
	public String addCollege(HttpServletRequest request,HttpServletResponse response) {
		int id =Integer.parseInt(request.getParameter("id"));
		String sname=request.getParameter("sname");
		int smarks=Integer.parseInt(request.getParameter("smarks"));
		String section=request.getParameter("section");
		String branch=request.getParameter("branch");
		
		College c =new College();
		c.setId(id);
		c.setSname(sname);
		c.setSmarks(smarks);
		c.setSection(section);
		c.setBranch(branch);
		se=sf.openSession();
		tx=se.beginTransaction();
		se.save(c);
		tx.commit();
		
		return "index.jsp";
		
	}
}
