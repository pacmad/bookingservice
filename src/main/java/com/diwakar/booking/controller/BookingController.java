package com.diwakar.booking.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.diwakar.booking.entities.Booking;
import com.diwakar.booking.exception.BookingNotFoundException;
import com.diwakar.booking.request.MovieBookingRequest;
import com.diwakar.booking.response.MovieBookingResponse;
import com.diwakar.booking.service.BookingService;

@RestController
@RequestMapping("/v1/bookings")
public class BookingController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookingController.class);

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	BookingService bookingService;

	// For listing down all bookings of a user
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public ResponseEntity<List<Booking>> getAllTheaters(@PathVariable("userId") String userId) throws Exception {

		return new ResponseEntity<List<Booking>>(bookingService.getAllBookingsByUserId(userId), HttpStatus.OK);

	}

	@RequestMapping(value = "/bookMovie", method = RequestMethod.POST)
	public ResponseEntity<MovieBookingResponse> bookTicket(@Valid @RequestBody MovieBookingRequest request) throws Exception {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<MovieBookingRequest> entity = new HttpEntity<>(request, headers);
		
		try {

			ResponseEntity<MovieBookingResponse> response = restTemplate.exchange(
					"http://localhost:8080/v1/theaters/bookMovieTickets", HttpMethod.POST, entity,
					MovieBookingResponse.class);
			
			return response;
		}
		catch(HttpStatusCodeException e) {
			String errorpayload = e.getResponseBodyAsString();
			throw new BookingNotFoundException(errorpayload);
	    }
		catch(Exception e)
		{
			throw e;
		}
		

	}

	// code for doing booking
	// return ResponseEntity.accepted().body(booking);
}
