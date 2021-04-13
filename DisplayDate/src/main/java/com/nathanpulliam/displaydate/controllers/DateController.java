package com.nathanpulliam.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DateController {
	@RequestMapping("/")
	public String index() {
		return "Index.jsp";
	}
	@RequestMapping("/{template}")
	public String dateTime(@PathVariable(value="template") String template, Model model) {
		model.addAttribute("template", template);
		String pattern;
		if(template.equals("date")) {
			pattern = "EEEEE 'the' dd 'of' MMMMM, yyyy";			
		} else {
			pattern = "KK:mm a";
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		model.addAttribute("date", date);
		return "DateTime.jsp";
	}
}
