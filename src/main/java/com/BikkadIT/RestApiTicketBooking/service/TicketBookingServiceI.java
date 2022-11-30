package com.BikkadIT.RestApiTicketBooking.service;

import com.BikkadIT.RestApiTicketBooking.model.Passenger;
import com.BikkadIT.RestApiTicketBooking.model.Ticket;

public  interface TicketBookingServiceI {

	public Ticket bookTicket(Passenger psg);
}
