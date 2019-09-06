package com.diwakar.booking.request;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

@Validated
public class MovieBookingRequest {

private String bookingId;
	
	@NotEmpty
	@NotNull
	private String userId;
	
	@NotEmpty
	@NotNull
	private String thId;
	
	@NotEmpty
	@NotNull
	private String slotNumber;
	
	@NotEmpty
	@NotNull
	private String movieName;
	
	@NotEmpty
	@NotNull
	private String seatsToBook;

	
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

	public String getSeatsToBook() {
		return seatsToBook;
	}

	public void setSeatsToBook(String seatsToBook) {
		this.seatsToBook = seatsToBook;
	}



	
	

}
