package com.nita.springBootDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nita.springBootDemo.POJO.Intro;

@RestController
public class Controller {
	
	@Autowired 
	Intro intro;
	
	@GetMapping("/greeting")
	public Intro  Greeting(@RequestParam(value="name")String name)
	{ intro.setContent("Welcome to my SpringBoot Demo. This project is being developed by "+name);
	 intro.setId((long) 1);
		return intro;
	}

}
