package com.nathanpulliam.thecode.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String process(@RequestParam(value="code") String code, HttpSession session) {
		Boolean isCode = code.equals("bushido");
		session.setAttribute("isCode", isCode);
		if(isCode) {
			return "redirect:/code";			
		} else {
			return "redirect:/";
		}
	}
	@RequestMapping("/code")
	public String displayCode(HttpSession session, Model model) {
		model.addAttribute("isCode", session.getAttribute("isCode"));
		return "code.jsp";
	}
}
