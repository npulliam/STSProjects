package com.nathanpulliam.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/process")
	public String process(
			@RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment", required=false) String comment,
			HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		if(comment.length()>0) {
			session.setAttribute("comment", comment);
		}
		return "redirect:/result";
	}
	@RequestMapping("/result")
	public String result(HttpSession session) {
		return "result.jsp";
	}
}
