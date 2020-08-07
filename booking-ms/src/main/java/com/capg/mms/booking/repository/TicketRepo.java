package com.capg.mms.booking.repository;

import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.mms.booking.model.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

	Object getTicketByDateTimeAndTicketId(LocalDateTime dateTime, int ticketId);

}
