package com.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.entity.Event;
import com.ticket.entity.Ticket;
import com.ticket.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepo;
	
	private static final String ACTIVE = "Y";
	
	public List<Event> getEvents() {
		return eventRepo.findByActive(ACTIVE);
	}
	
	public List<Ticket> getTickets(Long eventId) {
		
		Event event = eventRepo.getOne(eventId);
		return event.getTicketList();
	}
}
