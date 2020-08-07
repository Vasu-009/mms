package com.capg.mms.booking.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.mms.booking.model.Seat;
import com.capg.mms.booking.service.SeatServiceImpl;

@CrossOrigin("https://localhost:4200")
@RestController
@RequestMapping("/booking")
public class SeatController {
	
	@Autowired
	SeatServiceImpl seatService;
	
	@PostMapping("/add/seat")
	public ResponseEntity<Seat> addSeat(@Valid @RequestBody Seat seat) {
		seatService.addSeat(seat);
		return new ResponseEntity<>(seat, HttpStatus.CREATED);	
	}

	@GetMapping("/all/seats")
	public ResponseEntity<List<Seat>> getAvailableSeats(){
		List<Seat> seats = seatService.getAvailableSeats();
		return new ResponseEntity<>(seats, HttpStatus.OK);
	}	

}





