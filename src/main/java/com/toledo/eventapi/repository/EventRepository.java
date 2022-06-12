package com.toledo.eventapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.events.Event;

/**
 * @author Fellipe Toledo
 * @created 12/06/2022
 */

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

}
