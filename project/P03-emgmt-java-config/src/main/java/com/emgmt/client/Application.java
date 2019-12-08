package com.emgmt.client;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.emgmt.model.Event;
import com.emgmt.model.EventConfig;
import com.emgmt.service.EventService;

public class Application {

	public static void main(String[] args) {
	
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(EventConfig.class );
		
		EventService eventService=applicationContext.getBean("eventService",EventService.class);
		
		List<Event> events=eventService.getEvents();
		events.forEach(System.out::println);
	}

}
