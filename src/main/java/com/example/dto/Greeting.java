package com.example.dto;

public class Greeting {

	private long id;

	public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

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
