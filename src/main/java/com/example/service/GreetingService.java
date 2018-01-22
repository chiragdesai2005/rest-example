package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dto.Greeting;

@Service
public interface GreetingService {
	
	public Greeting saveGreeting(Greeting greeting);
	public Greeting getGreeting(long id);

}
