package com.toledo.eventapi.controller;

import com.toledo.eventapi.entity.Event;
import com.toledo.eventapi.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    @RequestMapping("/api/events")
    @ResponseBody
    public List<Event> findAllEvents(){
        return null;
    }

}
