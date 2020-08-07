package com.capg.mms.booking.service;

import java.util.List;
import com.capg.mms.booking.model.Seat;

public interface ISeatService {
	
	Seat addSeat (Seat seat);
	
	List<Seat> getAvailableSeats();	
	
}
