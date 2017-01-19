package com.jake.prac.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/home")
	public String home() {
		log.debug("logback::java template setting success!!");
		return "home";
	}
}
