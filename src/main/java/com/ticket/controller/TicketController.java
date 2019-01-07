package com.ticket.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ticket.service.EventService;
import com.ticket.service.TicketService;

@RestController
public class TicketController {

	static Logger log = LogManager.getLogger();
	
	@Autowired
	private EventService eventservice;

	@Autowired
	private TicketService ticketservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homeScreen(ModelAndView model) {
		model.setViewName("view");
		model.getModelMap().addAttribute("events", eventservice.getEvents());
		return model;
	}
	
	@RequestMapping(value = "/viewTickets/{eventId}", method = RequestMethod.GET)
	public ModelAndView viewTickets(@PathVariable("eventId") Long eventId,ModelAndView model) {
		model.setViewName("ticket");
		model.getModelMap().addAttribute("tickets", eventservice.getTickets(eventId));
		return model;
	}
	
	@RequestMapping(value = "/bookEvent/{ticketId}", method = RequestMethod.GET)
	public ModelAndView bookEvent(@PathVariable("ticketId") Long ticketId,ModelAndView model) {
		model.setViewName("bookTicket");
		model.getModelMap().addAttribute("ticket", ticketservice.getTicket(ticketId));
		return model;
	}
}
