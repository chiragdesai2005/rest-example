package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.dto.Greeting;
import com.example.service.GreetingService;

import junit.framework.Assert;

/**
 * @author chirag
 */
@SuppressWarnings("deprecation")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestExampleApplication.class)
@WebAppConfiguration
public class GreetingResourceTest {


   @Autowired
   GreetingService greetingService;
   
   @Test
   public void saveGreeting() throws Exception {
	   Greeting greeting = new Greeting();
	   greeting.setContent("Hi I am chirag");
	   Greeting g = greetingService.saveGreeting(greeting);
	   
	   Assert.assertNotNull(greetingService.getGreeting(g.getId()));
   }

    

    
}