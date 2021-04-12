package com.nathanpulliam.routingpractice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{dojo}")
	public String dojo(@PathVariable("dojo") String dojo) {
		if (dojo.equals("burbank-dojo")) {
			return "Burbank dojo is located in Southern California";
		} else if(dojo.equals("san-jose")) {
			return "SJ dojo is the headquarters.";
		} else {
			return "The dojo is awesome";
		}
	}
}
