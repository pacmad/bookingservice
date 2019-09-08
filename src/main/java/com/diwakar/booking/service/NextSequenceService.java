package com.diwakar.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;

import com.diwakar.booking.dao.CustomSequences;

import org.springframework.data.mongodb.core.query.Query;


public class NextSequenceService  {
	
    public static final String USER_ID_SEQUENCE_NAME = "user_id";
 
    
    @Autowired
     MongoTemplate mongoTemplate;
 
	/*
	 * @Autowired public MongoTemplate CustomSequences(MongoTemplate mongoTemplate){
	 * this.mongoTemplate = mongoTemplate; }
	 */
    
    public long getNextUserIdSequence() {
        return increaseCounter(USER_ID_SEQUENCE_NAME);
    }
 
    private long increaseCounter(String counterName){
        Query query = new Query(Criteria.where("name").is(counterName));
        Update update = new Update().inc("sequence", 1);
        CustomSequences counter = mongoTemplate.findAndModify(query, update, CustomSequences.class); // return old Counter object
        return counter.getSeq();
    }
}
