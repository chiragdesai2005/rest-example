package com.example.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Greeting;

@RestController
@RequestMapping("/greeting")
public class HelloResource {

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Greeting getGreeting(@PathVariable Long id) {
		return new Greeting(id, "How are you");
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Greeting addGreeting(@RequestBody Greeting greeting) {
		greeting.setId((long) Math.random());
		return greeting;
	}
	
}
