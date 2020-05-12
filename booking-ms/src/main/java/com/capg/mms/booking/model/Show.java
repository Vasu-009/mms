package com.capg.mms.booking.model;


import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

//@Entity
//@Table(name="show")
public class Show {
//@Id
private int showId;
//@DateTimeFormat(pattern = "yyyy/MM/ddThh:mm:ss")
private LocalDateTime showStartTime;
//@DateTimeFormat(pattern = "yyyy/MM/ddThh:mm:ss")
private LocalDateTime showEndTime;
//@ElementCollection
private List<Integer> seats;
private String showName;
private int movieId;
private int screenId;
private int theatreId;
public Show() {
	super();
}
public Show(int showId, LocalDateTime showStartTime, LocalDateTime showEndTime, List<Integer> seats, String showName, int movieId,
		int screenId, int theatreId) {
	super();
	this.showId = showId;
	this.showStartTime = showStartTime;
	this.showEndTime = showEndTime;
	this.seats = seats;
	this.showName = showName;
	this.movieId = movieId;
	this.screenId = screenId;
	this.theatreId = theatreId;
}
public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}
public LocalDateTime getShowStartTime() {
	return showStartTime;
}
public void setShowStartTime(LocalDateTime showStartTime) {
	this.showStartTime = showStartTime;
}
public LocalDateTime getShowEndTime() {
	return showEndTime;
}
public void setShowEndTime(LocalDateTime showEndTime) {
	this.showEndTime = showEndTime;
}
public List<Integer> getSeats() {
	return seats;
}
public void setSeats(List<Integer> seats) {
	this.seats = seats;
}
public String getShowName() {
	return showName;
}
public void setShowName(String showName) {
	this.showName = showName;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public int getScreenId() {
	return screenId;
}
public void setScreenId(int screenId) {
	this.screenId = screenId;
}
public int getTheatreId() {
	return theatreId;
}
public void setTheatreId(int theatreId) {
	this.theatreId = theatreId;
}
@Override
public String toString() {
	return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime + ", seats="
			+ seats + ", showName=" + showName + ", movieId=" + movieId + ", screenId=" + screenId + ", theatreId="
			+ theatreId + "]";
}



}
