package com.ticket.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ticket.service.EventService;

@RestController
public class TicketController {

	static Logger log = LogManager.getLogger();
	
	@Autowired
	private EventService eventservice;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homeScreen(ModelAndView model) {
		model.setViewName("view");
		model.getModelMap().addAttribute("events", eventservice.getCities());
		return model;
	}	
}
