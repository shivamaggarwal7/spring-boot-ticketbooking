package com.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.entity.Ticket;
import com.ticket.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepo;
	
	private static final String ACTIVE = "Y";
	
	public Ticket getTicket(Long ticketId) {
		
	Ticket ticket = ticketRepo.getOne(ticketId);	
	return ticket;
	}

}
