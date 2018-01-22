package com.example.dto;

import javax.validation.constraints.NotNull;

public class Greeting {

	private long id;

	public void setId(long id) {
		this.id = id;
	}

	
	public void setContent(String content) {
		this.content = content;
	}

	@NotNull
	private String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public Greeting() {
	
	}


	public long getId() {
		return id;
	}

	
	public String getContent() {
		return content;
	}
}
