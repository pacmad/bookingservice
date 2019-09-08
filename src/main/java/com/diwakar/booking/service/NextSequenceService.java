package com.diwakar.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.diwakar.booking.dao.CustomSequences;

import org.springframework.data.mongodb.core.query.Query;


@Service
public class NextSequenceService  {
	
    @Autowired 
    private MongoTemplate mongoTemplate;
    
    

    public int getNextSequence(String seqName)
    {
        CustomSequences counter = mongoTemplate.findAndModify(
        		new Query(Criteria.where("_id").is(seqName)),
            new Update().inc("seq",1),
            new FindAndModifyOptions().returnNew(true).upsert(true),
            CustomSequences.class);
        return counter.getSeq();
    }
}
