package com.capg.mms.booking.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.capg.mms.booking.model.Payment;
import com.capg.mms.booking.model.Seat;
import com.capg.mms.booking.repository.*;

@Service
public class BookingServiceImpl implements IBookingService {
	@Autowired
    BookingMovieRepository bookingmovieRepo;
	
    List<Seat> seats;
	
	@Autowired
	RestTemplate rt;

	@Override
	public List<Seat> chooseSeats(List<Integer> seatIds) {
		
		rt.put("http://seat-ms/seat/block", seatIds);
		Seat[] blockedSeats=rt.getForObject("http://seat-ms/seat/block",Seat[].class);
		return Arrays.asList(blockedSeats);
	}

	@Override
	public double calculateTotalCost(List<Seat> seats) {
		return seats.stream().mapToDouble(s->s.getSeatPrice()).sum();
	}

	@Override
	public Payment choosePaymentMethod(Payment payment) {
		
		return payment;
	}

}
