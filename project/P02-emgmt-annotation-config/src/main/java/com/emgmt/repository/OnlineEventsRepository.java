package com.emgmt.repository;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.emgmt.model.Event;


@Repository
public class OnlineEventsRepository implements EventRepository{
	public static List<Event> eventList=null;
	static{
		eventList=new ArrayList<Event>();
		Event e1=new Event(11, "Subbu marriage","marriage", 
				new Date(2020,01,19), "Bride to find", 1000000d, 1000,"C10", "not paid",
				new Date(2020, 01, 25));
		Event e2=new Event(12, "Ram Birthday Party","Birthday", 
				new Date(2019,12,19), "grand celebration", 50000d, 300,"C11", "not paid",
				new Date(2019, 12, 25));
		eventList.add(e1);
		eventList.add(e2);
		System.out.println("Offline event list");
	}
	
	public List<Event> getEvents() {
	
		return eventList;
	}

	



}
