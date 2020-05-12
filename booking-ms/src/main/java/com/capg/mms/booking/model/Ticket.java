 package com.capg.mms.booking.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ticket_movie")
public class Ticket {
//@Id
//private int ticketId;
////@OneToMany
////@Column
//private int noOfSeats;
//
//@ElementCollection
//private List<String> seatName;
//@OneToOne
//private Booking bookingRef;
//private boolean ticketStatus;
//private String screenName;
	//private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	public int ticketId;
    public int noOfSeats;
    public String movieName;
    public String theatreName;
    public String customerName;
    public String emailId;
    public int phno;
    public String paymentMethod;
public Ticket() {
	super();
}
public Ticket(int ticketId, int noOfSeats, String movieName, String theatreName, String customerName, String emailId,
		int phno, String paymentMethod) {
	super();
	this.ticketId = ticketId;
	this.noOfSeats = noOfSeats;
	this.movieName = movieName;
	this.theatreName = theatreName;
	this.customerName = customerName;
	this.emailId = emailId;
	this.phno = phno;
	this.paymentMethod = paymentMethod;
}
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getTheatreName() {
	return theatreName;
}
public void setTheatreName(String theatreName) {
	this.theatreName = theatreName;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public String getPaymentMethod() {
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}
@Override
public String toString() {
	return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", movieName=" + movieName + ", theatreName="
			+ theatreName + ", customerName=" + customerName + ", emailId=" + emailId + ", phno=" + phno
			+ ", paymentMethod=" + paymentMethod + "]";
}


//public Ticket(int ticketId, int noOfSeats, List<String> seatName, Booking bookingRef, boolean ticketStatus,
//		String screenName) {
//	super();
//	this.ticketId = ticketId;
//	this.noOfSeats = noOfSeats;
//	this.seatName = seatName;
//	this.bookingRef = bookingRef;
//	this.ticketStatus = ticketStatus;
//	this.screenName = screenName;
//}
//public int getTicketId() {
//	return ticketId;
//}
//public void setTicketId(int ticketId) {
//	this.ticketId = ticketId;
//}
//public int getNoOfSeats() {
//	return noOfSeats;
//}
//public void setNoOfSeats(int noOfSeats) {
//	this.noOfSeats = noOfSeats;
//}
//public List<String> getSeatName() {
//	return seatName;
//}
//public void setSeatName(List<String> seatName) {
//	this.seatName = seatName;
//}
//public Booking getBookingRef() {
//	return bookingRef;
//}
//public void setBookingRef(Booking bookingRef) {
//	this.bookingRef = bookingRef;
//}
//public boolean isTicketStatus() {
//	return ticketStatus;
//}
//public void setTicketStatus(boolean ticketStatus) {
//	this.ticketStatus = ticketStatus;
//}
//public String getScreenName() {
//	return screenName;
//}
//public void setScreenName(String screenName) {
//	this.screenName = screenName;
//}
//@Override
//public String toString() {
//	return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", seatName=" + seatName + ", bookingRef="
//			+ bookingRef + ", ticketStatus=" + ticketStatus + ", screenName=" + screenName + "]";
//}

}
