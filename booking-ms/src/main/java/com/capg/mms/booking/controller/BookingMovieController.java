package com.capg.mms.booking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.mms.booking.model.Payment;
import com.capg.mms.booking.model.Seat;
import com.capg.mms.booking.service.*;

@CrossOrigin("https://localhost:4200")
@RestController
@RequestMapping("/booking")
public class BookingMovieController {
	@Autowired
	BookingServiceImpl service;
		
	@GetMapping("/seats")	
	public ResponseEntity<List<Seat>> calculateTotalCost(@RequestBody List<Seat> seats){
		service.calculateTotalCost(seats);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/choose/seats")	
	public ResponseEntity<List<Seat>> chooseSeats(@RequestBody List<Integer> seatIds){
	
		return new ResponseEntity<>(service.chooseSeats(seatIds),HttpStatus.OK);
	}
	
	@PostMapping("/payment")
	public ResponseEntity<Payment> choosePaymentMethod(Payment payment) {
		return new ResponseEntity<>(service.choosePaymentMethod(payment),HttpStatus.OK);
		
	}	

}
