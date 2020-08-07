package com.capg.mms.booking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.mms.booking.exception.SlotNotAvailableException;
import com.capg.mms.booking.exception.TicketCancellationException;
import com.capg.mms.booking.model.Ticket;
import com.capg.mms.booking.repository.TicketRepo;

@Service
public class TicketServiceImpl implements ITicketService {
	@Autowired
    TicketRepo ticketRepo;
	
	@Override
	public Ticket showTicket(int ticketId)  {
		
		return ticketRepo.getOne(ticketId);
     }
	
	@Override
	public Ticket addTicket(Ticket ticket) throws SlotNotAvailableException {
		
          return ticketRepo.save(ticket);
        }

	@Override
	public boolean cancelBooking(int ticketId) throws TicketCancellationException {

		if (ticketRepo.existsById(ticketId)) 
		{
			ticketRepo.deleteById(ticketId);
		}
		else {
			throw new TicketCancellationException("Cancellation Failed : Id not found");
		}
		return true;
	}

    @Override
     public List<Ticket> getAllBookings(Ticket ticket) {
	
	    return ticketRepo.findAll();
     }

}
