package com.buildingblocks.industries.infra.mongo.repositories;

import com.buildingblocks.industries.infra.mongo.entities.Event;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IEventsRepository extends ReactiveMongoRepository<Event, String> {
}
