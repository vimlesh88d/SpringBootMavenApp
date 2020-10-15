package com.devops.MavenApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		String message = "Welcome to new India22";
		return new ModelAndView("welcome", "message", message);

	}

}
