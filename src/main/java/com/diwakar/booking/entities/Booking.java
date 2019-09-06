package com.diwakar.booking.entities;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookings")
public class Booking {
	
	private String bookingId;
	
	private String userId;
	
	private String thId;
	
	private String slotNumber;
	
	private String movieName;
	
	private String seatsBooked;

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getThId() {
		return thId;
	}

	public void setThId(String thId) {
		this.thId = thId;
	}

	public String getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(String slotNumber) {
		this.slotNumber = slotNumber;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(String seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	
	

}