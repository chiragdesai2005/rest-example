package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Greeting;
import com.example.service.GreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingResource {
	
	@Autowired
	private GreetingService greetingService;

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Greeting getGreeting(@PathVariable Long id) {
		return greetingService.getGreeting(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Greeting addGreeting(@RequestBody Greeting greeting) {
		return greetingService.saveGreeting(greeting);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteGreeting(@PathVariable Long id) {
		
	}
	
}
