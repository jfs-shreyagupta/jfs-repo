package com.emgmt.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emgmt.model.Event;
import com.emgmt.service.EventService;

public class Application {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		EventService eventService=applicationContext.getBean("eventService",EventService.class);
		
		List<Event> events=eventService.getEvents();
		events.forEach(System.out::println);
	}

}
