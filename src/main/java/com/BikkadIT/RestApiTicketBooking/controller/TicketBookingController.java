package com.BikkadIT.RestApiTicketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.RestApiTicketBooking.model.Passenger;
import com.BikkadIT.RestApiTicketBooking.model.Ticket;
import com.BikkadIT.RestApiTicketBooking.service.TicketBookingServiceI;

@RestController
public class TicketBookingController {

	@Autowired
	public TicketBookingServiceI ticketBookingServiceI;
	
	@PostMapping(value = "/bookTicket",consumes = "application/json",produces = "application/json")
	public ResponseEntity< Ticket> bookTicket(@RequestBody Passenger psg){
		Ticket ticket = ticketBookingServiceI.bookTicket(psg);
		
		return  new ResponseEntity<Ticket>(ticket,HttpStatus.CREATED);
		
	}
	
	
	
}
