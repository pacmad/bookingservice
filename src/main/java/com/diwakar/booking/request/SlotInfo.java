package com.diwakar.booking.request;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

public class SlotInfo {

	
	@NotNull
	private String slotNumber;

	
	@NotNull
	private String seatsAvail;

	
	@NotNull
	private Movie movie;

	public String getSeatsAvail() {
		return seatsAvail;
	}

	public void setSeatsAvail(String seatsAvail) {
		this.seatsAvail = seatsAvail;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(String slotNumber) {
		this.slotNumber = slotNumber;
	}

	public SlotInfo() {
		super();

	}

}
