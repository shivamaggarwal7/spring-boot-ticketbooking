package com.ticket.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue
	private long ticketId;
	private String tktType;
	private String tktDesc;
	private String endDate;
	private double price;
	private int tktCount;
	
	@OneToMany(mappedBy="ticket")
	@JsonManagedReference
	private List<User> userList;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="eventId")
	@JsonBackReference
	private Event event;

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public String getTktType() {
		return tktType;
	}

	public void setTktType(String tktType) {
		this.tktType = tktType;
	}

	public String getTktDesc() {
		return tktDesc;
	}

	public void setTktDesc(String tktDesc) {
		this.tktDesc = tktDesc;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTktCount() {
		return tktCount;
	}

	public void setTktCount(int tktCount) {
		this.tktCount = tktCount;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

}
