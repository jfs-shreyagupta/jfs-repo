package com.emgmt.service;

import java.util.List;

import com.emgmt.model.Event;
import com.emgmt.repository.EventRepository;

public class EventServiceImpl implements EventService{

//	EventRepository eventRepository=new OfflineEventsRepository();
	
	
	EventRepository eventRepository=null;
//	public void setEventRepository(EventRepository eventRepository) {
//		this.eventRepository = eventRepository;
//	}
	
	public EventServiceImpl(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	public List<Event> getEvents() {
		// TODO Auto-generated method stub
		return eventRepository.getEvents();
	}



}
