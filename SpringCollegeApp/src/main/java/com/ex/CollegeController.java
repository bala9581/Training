package com.ex;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CollegeController {
	
	@Autowired
	private CollegeRepository cc;
	@RequestMapping("/")
	public String home(Model m) {
		return "index";
	}
	@RequestMapping("/insert")
	public String insertForm(Model m) {
		m.addAttribute("book",new BookApp());
		return "insert";
	}
	@RequestMapping("/addbook")
	public ModelAndView addBookApp(@ModelAttribute BookApp book) {
		cc.saveBookApp(book);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("insert");
		return mv;
	}
	@RequestMapping("/update")
	public String updateForm(Model m) {
		m.addAttribute("book",new BookApp());
		return "update";
	}
	@RequestMapping("/updatebook")
	public ModelAndView updateBookApp(@ModelAttribute BookApp book) {
		cc.updateBookApp(book);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("update");
		return mv;
	}
	@RequestMapping("/delete")
	public String deleteForm(Model m) {
		m.addAttribute("book",new BookApp());
		return "delete";
	}
	@RequestMapping("/deletebook")
	public ModelAndView deleteBookApp(@ModelAttribute BookApp book) {
		cc.deleteBookApp(book);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("delete");
		return mv;
	}
	@RequestMapping("view")
	public String viewBookApp(Model m) {
		List<BookApp> list=cc.getBookApp();
		m.addAttribute("list",list);
		return "view";
	}
}