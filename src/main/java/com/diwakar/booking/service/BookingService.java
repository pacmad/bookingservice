package com.diwakar.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diwakar.booking.dao.BookingRepository;
import com.diwakar.booking.entities.Booking;
import com.diwakar.booking.exception.BookingNotFoundException;
import com.diwakar.booking.request.MovieBookingRequest;
import com.diwakar.booking.response.MovieBookingResponse;

@Service
public class BookingService {

	@Autowired
	BookingRepository bookingRepo;

	@Autowired
	NextSequenceService sequenceService;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Transactional
	public Booking bookMovie(MovieBookingRequest request, String id) {

		return new Booking();

	}

	public Booking updateBookingInfo(MovieBookingRequest request) {

		try {
			Booking booking = new Booking();
			booking.setBookingId(sequenceService.getNextSequence("customSequences"));
			booking.setThId(request.getThId());
			booking.setUserId(request.getUserId());
			booking.setMovieName(request.getMovieName());
			booking.setSeatsBooked(request.getSeatsToBook());
			booking.setSlotNumber(request.getSlotNumber());
			return bookingRepo.save(booking);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}

	}

	public List<Booking> getAllBookingsByUserId(String userId) {

		List<Booking> bookings = mongoTemplate.find(new Query(Criteria.where("userId").is(userId)), Booking.class);
		try {
			if (bookings != null) {
				return bookings;
			} else {
				throw new BookingNotFoundException("Booking Not Found For this user");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;

		}
	}
}
