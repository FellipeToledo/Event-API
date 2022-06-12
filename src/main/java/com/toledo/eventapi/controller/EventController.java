package com.toledo.eventapi.controller;

import com.toledo.eventapi.entity.Event;
import com.toledo.eventapi.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Fellipe Toledo
 * @created 11/06/2022
 */

@RestController
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping(path = "api/events")
    public List<Event> findAll(){
        return eventRepository.findAll();
    }
    @GetMapping(path = "/api/event/{id}")
    public ResponseEntity findById(@PathVariable("id") Integer id) {
        return eventRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/event/save")
    public Event save(@RequestBody Event event) {
        return eventRepository.save(event);
    }
}
