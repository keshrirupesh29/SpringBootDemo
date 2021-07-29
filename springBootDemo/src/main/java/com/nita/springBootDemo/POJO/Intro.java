package com.nita.springBootDemo.POJO;

import org.springframework.stereotype.Component;

@Component
public class Intro {
	
	private Long id;
	private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
