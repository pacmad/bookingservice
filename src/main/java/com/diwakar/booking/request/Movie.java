package com.diwakar.booking.request;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

public class Movie {

	
	@NotNull
	private String movID;

	private String movName;

	
	@NotNull
	private String movDescr;

	
	@NotNull
	private String movTyp;

	private String movDuration;

	public String getMovID() {
		return movID;
	}

	public void setMovID(String movID) {
		this.movID = movID;
	}

	public String getMovName() {
		return movName;
	}

	public void setMovName(String movName) {
		this.movName = movName;
	}

	public String getMovDescr() {
		return movDescr;
	}

	public void setMovDescr(String movDescr) {
		this.movDescr = movDescr;
	}

	public String getMovTyp() {
		return movTyp;
	}

	public void setMovTyp(String movTyp) {
		this.movTyp = movTyp;
	}

	public String getMovDuration() {
		return movDuration;
	}

	public void setMovDuration(String movDuration) {
		this.movDuration = movDuration;
	}

}