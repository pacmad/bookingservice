package com.diwakar.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diwakar.booking.dao.BookingRepository;
import com.diwakar.booking.entities.Booking;
import com.diwakar.booking.request.MovieBookingRequest;

@Service
public class BookingService {

	@Autowired
	BookingRepository bookingRepo;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Transactional
	public Booking bookMovie(MovieBookingRequest request, String id) {

		return new Booking();

	}
}
