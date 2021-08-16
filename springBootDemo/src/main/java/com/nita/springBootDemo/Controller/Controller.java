package com.nita.springBootDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nita.springBootDemo.POJO.Book;
import com.nita.springBootDemo.POJO.Intro;
import com.nita.springBootDemo.Repository.CustomInterface;

@RestController
public class Controller {
	
	@Autowired 
	Intro intro;
	@Autowired
	Book book;
	@Autowired CustomInterface customInterface;
	
	@GetMapping("/greeting")
	public Intro  Greeting(@RequestParam(value="name")String name)
	{ intro.setContent("Welcome to my SpringBoot Demo. This project is being developed by "+name);
	 intro.setId((long) 1);
		return intro;
	}
	
	@PostMapping("/addBook")
	public String AddBook(@RequestBody Book book)
	{ 
		long Id=book.getId();
		String name=book.getBookName();
		String Description=book.getDescription();
		customInterface.save(book);
		
		return "My Book Id is "+Id +" My book name is "+name+" and My book Description is "+Description;
	}
	
	@PostMapping("/getBook")
	public String AddBook(@RequestParam (value="id")long  id)
	{ 
		Book book=customInterface.getById(id);
		
		
		
		String name=book.getBookName();
		String Description=book.getDescription();
		
		
		return " My book name is "+name+" and My book Description is "+Description;
	}

}
