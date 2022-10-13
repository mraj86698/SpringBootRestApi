package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
public class RestController1 {
	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello World";
	}
}