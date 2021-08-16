package com.nita.springBootDemo.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Book {
	@Id
	@Column
	private long id;
	@Column
	private String bookName;
	@Column
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
	
	


