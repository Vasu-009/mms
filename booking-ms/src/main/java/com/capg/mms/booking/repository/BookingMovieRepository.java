package com.capg.mms.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.mms.booking.model.Booking;

public interface BookingMovieRepository extends JpaRepository<Booking,Integer>{

	
}
