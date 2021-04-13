package com.nathanpulliam.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("counter")==null) {
			session.setAttribute("counter", 0);
		}
		Integer count = (Integer) session.getAttribute("counter");
		session.setAttribute("counter", ++count);
		return "index.jsp";
	}
	
	@RequestMapping("/counter") 
	public String counter(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("counter");
		if(count == null) {
			count = 0;
		}
		model.addAttribute("count", count);
		return "counter.jsp";
	}
}
