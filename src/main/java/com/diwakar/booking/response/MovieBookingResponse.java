package com.diwakar.booking.response;

import org.springframework.validation.annotation.Validated;



@Validated
public class MovieBookingResponse {

	private String thId;
	

	private int slotBooked;

	private String movieBooked;
	
	private int seatsBooked;

	public String getThId() {
		return thId;
	}

	public void setThId(String thId) {
		this.thId = thId;
	}

	public int getSlotBooked() {
		return slotBooked;
	}

	public void setSlotBooked(int slotBooked) {
		this.slotBooked = slotBooked;
	}

	public String getMovieBooked() {
		return movieBooked;
	}

	public void setMovieBooked(String movieBooked) {
		this.movieBooked = movieBooked;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	
	
	

}
