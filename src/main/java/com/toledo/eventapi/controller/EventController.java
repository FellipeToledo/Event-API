package com.toledo.eventapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fellipe Toledo
 * @created 11/06/2022
 */

@RestController
public class EventController {
    @RequestMapping("/")
    @ResponseBody
    public String Event(){
        return "EVENT";
    }
}
