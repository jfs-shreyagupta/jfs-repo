package com.emgmt.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.emgmt"})
public class EventConfig {
	
	
//	@Bean(name="eventService")
//	public EventService getEventService(){
//		EventService eventService=new EventServiceImpl(getEventRepository());
//		return eventService;
//	}
//
//	@Bean(name="eventRepository")
//	public EventRepository getEventRepository(){
//		EventRepository eventRepository=new OnlineEventsRepository();
//		return eventRepository;
//	}
}
