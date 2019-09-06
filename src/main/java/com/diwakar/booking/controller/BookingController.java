package com.diwakar.booking.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.diwakar.booking.entities.Booking;
import com.diwakar.booking.request.MovieBookingRequest;

@RestController
@RequestMapping("/v1/bookings")
public class BookingController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookingController.class);

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/bookMovie", method = RequestMethod.POST)
	public ResponseEntity<Object> bookTicket(@Valid @RequestBody MovieBookingRequest request) {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<MovieBookingRequest> entity = new HttpEntity<>(request, headers);

		ResponseEntity<Object> response = restTemplate.exchange(
				"http://localhost:8080/v1/theatres/bookMovieTickets/{theater_id}", HttpMethod.POST, entity,
				Object.class);
		return response;

	}

	// code for doing booking
	// return ResponseEntity.accepted().body(booking);
}
