package com.capg.mms.booking.service;

import java.util.List;

import com.capg.mms.booking.exception.SlotNotAvailableException;
import com.capg.mms.booking.exception.TicketCancellationException;
import com.capg.mms.booking.model.Ticket;

public interface ITicketService {
	
	public Ticket addTicket(Ticket ticket) throws SlotNotAvailableException;
	
	public Ticket showTicket(int ticketId);
    
	public List<Ticket> getAllBookings(Ticket ticket);

	public boolean cancelBooking(int ticketId) throws TicketCancellationException;
	
	

}
