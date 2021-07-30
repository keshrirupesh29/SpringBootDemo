package com.nita.springBootDemo.POJO;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	private long id;
	private String bookName;
	private String description;
	
	




	public long getId() {
		return id;
	}






	public void setId(long id) {
		this.id = id;
	}






	public String getBookName() {
		return bookName;
	}






	public void setBookName(String bookName) {
		this.bookName = bookName;
	}






	public String getDescription() {
		return description;
	}






	public void setDescription(String description) {
		this.description = description;
	}

}
	
	


