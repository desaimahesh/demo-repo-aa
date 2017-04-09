package com.aa.mss.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {

	private Log logger = LogFactory.getLog(HelloWorldController.class);

	private static final String template = "Hello, %s!";

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String sayHello(
			@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
		logger.debug("Executing sayHello method");
		return String.format(template, name);
	}

}