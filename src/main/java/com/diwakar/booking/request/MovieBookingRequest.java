package com.diwakar.booking.request;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

@Validated
public class MovieBookingRequest {

private String bookingId;
	
	
	@NotNull
	private String userId;
	
	
	@NotNull
	private String thId;
	
	
	@NotNull
	private int slotNumber;
	
	
	@NotNull
	private String movieName;
	
	
	@NotNull
	private int seatsToBook;

	
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

	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getSeatsToBook() {
		return seatsToBook;
	}

	public void setSeatsToBook(int seatsToBook) {
		this.seatsToBook = seatsToBook;
	}



	
	

}
