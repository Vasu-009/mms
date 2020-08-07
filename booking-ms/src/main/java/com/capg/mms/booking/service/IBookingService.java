package com.capg.mms.booking.service;

import java.util.List;
import com.capg.mms.booking.model.Payment;
import com.capg.mms.booking.model.Seat;

public interface IBookingService {
	
	public List<Seat> chooseSeats(List<Integer> seatIds);
	
	public double calculateTotalCost(List<Seat> seats);
	
	public Payment choosePaymentMethod(Payment payment);	
	
}
