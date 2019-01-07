package com.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.entity.User;
import com.ticket.repository.TicketRepository;
import com.ticket.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private TicketRepository ticketRepo;
	
	public void ticketBooking(String userName,String email,String phone,Long ticketId) {
		
		User user = new User(userName, email, phone);
		user.setTicket(ticketRepo.getOne(ticketId));
		userRepo.save(user);
	}

}
