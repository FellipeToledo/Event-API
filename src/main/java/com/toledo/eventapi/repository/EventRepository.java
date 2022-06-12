package com.toledo.eventapi.repository;

import com.toledo.eventapi.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Fellipe Toledo
 * @created 12/06/2022
 */

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

}
