package com.diwakar.booking.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.diwakar.booking.entities.Booking;



@Repository
public interface BookingRepository extends MongoRepository<Booking,Long>{
	


}

