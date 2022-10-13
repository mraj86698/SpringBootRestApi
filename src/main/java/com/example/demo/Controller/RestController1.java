package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;

@RestController
//Use Get Request Method
@RequestMapping("/hello1")
public class RestController1 {
	@RequestMapping(value = { "", "/", "/home" })
	public String sayHello() {
		return "Hello World";
	}
	//get request method and Pass Name with query parameter
	 @RequestMapping(value = {"/query"},method = RequestMethod.GET)
	    public String sayHello(@RequestParam(value = "name") String name){
	        return  "Hello "+name+"From Bridglabz";
	    }
	 //Get Request Method And Pass Name with Path Variable
	 @GetMapping("/hello/{name}")
	    public String sayHelloParam(@PathVariable String name){
	        return  "Hello "+name;
	    }
	 //Use POST Request Method and pass first name and last name in the Body
	 @PostMapping("/post")
	    public String sayHello(@RequestBody User user){
	        return "Hello "+user.getFirstName() +" "+ user.getLastName();
	    }
}