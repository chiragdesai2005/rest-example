package com.example.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.dto.Greeting;

@Service
public class GreetingServiceImpl implements GreetingService{
	
	private static Map<Long,Greeting> hmGreeting = new HashMap();

	@Override
	public Greeting saveGreeting(Greeting greeting) {
		Long id = Long.parseLong(String.valueOf(hmGreeting.size()+1));
		greeting.setId(id);
		hmGreeting.put(id, greeting);
		return greeting;
	}

	@Override
	public Greeting getGreeting(long id) {
		return hmGreeting.get(id);
	}

}
