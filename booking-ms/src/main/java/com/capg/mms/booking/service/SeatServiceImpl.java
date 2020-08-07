package com.capg.mms.booking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.capg.mms.booking.model.Seat;

import com.capg.mms.booking.repository.ISeatRepository;

@Service
public class SeatServiceImpl implements ISeatService {

	@Autowired
	ISeatRepository seatRepo;
	@Autowired
	RestTemplate rt;
	
	@Override
	public Seat addSeat(Seat seat) {
		
		return rt.postForObject("http://seat-ms/seat/add", seat, Seat.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Seat> getAvailableSeats() {
		
		return (List<Seat>) rt.getForObject("http://seat-ms/seat/all", Seat.class);
	}
}
