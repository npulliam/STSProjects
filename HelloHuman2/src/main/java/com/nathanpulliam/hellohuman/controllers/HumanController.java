package com.nathanpulliam.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String nameQuery, @RequestParam(value="lastName", required=false) String lastNameQuery) {
		if(nameQuery != null) {
			if (lastNameQuery != null) {
				return "Hello " + nameQuery + " " + lastNameQuery;				
			} else {
				return "Hello " + nameQuery;
			}
		} else {			
			return "Hello, human.";
		}
	}
}
