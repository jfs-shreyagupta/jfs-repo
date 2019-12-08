package com.emgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emgmt.model.Event;
import com.emgmt.repository.EventRepository;


@Service("eventService")
public class EventServiceImpl implements EventService{

	EventRepository eventRepository=null;
	
	public void setEventRepository(EventRepository eventRepository) {
		System.out.println("setter injection");
		this.eventRepository = eventRepository;
	}

	public EventServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired	
	public EventServiceImpl(EventRepository eventRepository) {
		this.eventRepository = eventRepository; 
	}

	public List<Event> getEvents() {
	
		return eventRepository.getEvents();
	}



}
