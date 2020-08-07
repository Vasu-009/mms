package com.capg.mms.bookings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.capg.mms.booking.MmsBookingApplication;
import com.capg.mms.booking.controller.TicketController;
import com.capg.mms.booking.repository.TicketRepo;
import com.capg.mms.booking.service.TicketServiceImpl;


@SpringBootTest(classes = MmsBookingApplication.class)
class MmsBookingApplicationTestsTest {

	@Autowired
	TicketServiceImpl ticketservice;
	@Autowired
	TicketRepo ticketRepo;
	@Autowired
	TicketController showticket;

	@Test
	void testGetAllBookings() {
		assertEquals(true, !ticketRepo.findAll().isEmpty());
	}


}
