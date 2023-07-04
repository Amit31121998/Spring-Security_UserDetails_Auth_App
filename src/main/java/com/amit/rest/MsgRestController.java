package com.amit.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgRestController {

	@GetMapping("/c")
	public String contact() {
		return "+91 8340692176";
	}

	@GetMapping("/greet")
	public String greetMsg() {
		return "Good evening";
	}

	@GetMapping("/welcome")
	public String welMsg() {
		return "welcome to ashokit";
	}
}
