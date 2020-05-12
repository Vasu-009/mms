package com.capg.mms.booking.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.web.client.RestTemplate;


import org.springframework.boot.actuate.autoconfigure.health.HealthProperties.Show;
@Entity
@Table(name="booking")
public class Booking {
//@Id
private int bookingId;
private int movieId;
private int showId;
private Show showRef;
private LocalDate bookingDate;
private int transactionId;
  // //@ElementCollection
@Id
private double totalCost;
@ElementCollection
private List<Integer> seatList;
//@OneToOne
//private Ticket ticket;

//	@Id
//	private int bookingId;
//	private String customerName;
//	private String movieName;
//	private String theatreName;
//	private String emailId;
//	private String phno;
//	private String paymentMethod;
//	private int seats;
//	@OneToOne
//	private Ticket ticket;
//	private LocalDate bookingDate;

public Booking() {
	// TODO Auto-generated constructor stub
}

//public Booking(int bookingId, String customerName, String movieName, String theatreName, String emailId, String phno,
//		String paymentMethod, int seats, Ticket ticket, LocalDate bookingDate) {
//	super();
//	this.bookingId = bookingId;
//	this.customerName = customerName;
//	this.movieName = movieName;
//	this.theatreName = theatreName;
//	this.emailId = emailId;
//	this.phno = phno;
//	this.paymentMethod = paymentMethod;
//	this.seats = seats;
//	this.ticket = ticket;
//	this.bookingDate = bookingDate;
//}
//
//public int getBookingId() {
//	return bookingId;
//}
//
//public void setBookingId(int bookingId) {
//	this.bookingId = bookingId;
//}
//
//public String getCustomerName() {
//	return customerName;
//}
//
//public void setCustomerName(String customerName) {
//	this.customerName = customerName;
//}
//
//public String getMovieName() {
//	return movieName;
//}
//
//public void setMovieName(String movieName) {
//	this.movieName = movieName;
//}
//
//public String getTheatreName() {
//	return theatreName;
//}
//
//public void setTheatreName(String theatreName) {
//	this.theatreName = theatreName;
//}
//
//public String getEmailId() {
//	return emailId;
//}
//
//public void setEmailId(String emailId) {
//	this.emailId = emailId;
//}
//
//public String getPhno() {
//	return phno;
//}
//
//public void setPhno(String phno) {
//	this.phno = phno;
//}
//
//public String getPaymentMethod() {
//	return paymentMethod;
//}
//
//public void setPaymentMethod(String paymentMethod) {
//	this.paymentMethod = paymentMethod;
//}
//
//public int getSeats() {
//	return seats;
//}
//
//public void setSeats(int seats) {
//	this.seats = seats;
//}
//
//public Ticket getTicket() {
//	return ticket;
//}
//
//public void setTicket(Ticket ticket) {
//	this.ticket = ticket;
//}
//
//public LocalDate getBookingDate() {
//	return bookingDate;
//}
//
//public void setBookingDate(LocalDate bookingDate) {
//	this.bookingDate = bookingDate;
//}
//
//@Override
//public String toString() {
//	return "Booking [bookingId=" + bookingId + ", customerName=" + customerName + ", movieName=" + movieName
//			+ ", theatreName=" + theatreName + ", emailId=" + emailId + ", phno=" + phno + ", paymentMethod="
//			+ paymentMethod + ", seats=" + seats + ", ticket=" + ticket + ", bookingDate=" + bookingDate + "]";
//}


public Booking(int bookingId, int movieId, int showId, Show showRef, LocalDate bookingDate, int transactionId,
		double totalCost, List<Integer> seatList, Ticket ticket) {
	super();
	this.bookingId = bookingId;
	this.movieId = movieId;
	this.showId = showId;
	this.showRef = showRef;
	this.bookingDate = bookingDate;
	this.transactionId = transactionId;
	this.totalCost = totalCost;
	this.seatList = seatList;
//	this.ticket = ticket;
}
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}
public Show getShowRef() {
	return showRef;
}
public void setShowRef(Show showRef) {
	this.showRef = showRef;
}
public LocalDate getBookingDate() {
	return bookingDate;
}
public void setBookingDate(LocalDate bookingDate) {
	this.bookingDate = bookingDate;
}
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
public double getTotalCost() {
	return totalCost;
}
public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}
public List<Integer> getSeatList() {
	return seatList;
}
public void setSeatList(List<Integer> seatList) {
	this.seatList = seatList;
}
//public Ticket getTicket() {
//	return ticket;
//}
//public void setTicket(Ticket ticket) {
//	this.ticket = ticket;
//}
@Override
public String toString() {
	return "Booking [bookingId=" + bookingId + ", movieId=" + movieId + ", showId=" + showId + ", showRef=" + showRef
			+ ", bookingDate=" + bookingDate + ", transactionId=" + transactionId + ", totalCost=" + totalCost
			+ ", seatList=" + seatList + "]";
}

}
