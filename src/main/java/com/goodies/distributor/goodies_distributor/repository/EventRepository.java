package com.goodies.distributor.goodies_distributor.repository;


import com.goodies.distributor.goodies_distributor.entity.EventDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<EventDetails, String> {
}
