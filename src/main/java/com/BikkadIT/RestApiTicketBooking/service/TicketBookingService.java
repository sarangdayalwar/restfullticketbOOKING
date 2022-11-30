package com.BikkadIT.RestApiTicketBooking.service;

import org.springframework.stereotype.Service;

import com.BikkadIT.RestApiTicketBooking.model.Passenger;
import com.BikkadIT.RestApiTicketBooking.model.Ticket;

@Service
public class TicketBookingService implements TicketBookingServiceI   {

	
	public Ticket bookTicket(Passenger psg) {
		if (psg==null) {

			return null;
		
	}else {
		Ticket ticket=new Ticket();
		ticket.setPnr(111);
		ticket.setTicketStatus( "confirmed");
		ticket.setTicketPrice(123.00);
		return ticket;
		
	}
	}}