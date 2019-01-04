package com.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.entity.Event;
import com.ticket.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepo;
	
	private static final String ACTIVE = "Y";
	
	public List<Event> getCities() {
		return eventRepo.findByActive(ACTIVE);
	}

}
