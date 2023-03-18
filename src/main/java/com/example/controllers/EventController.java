package com.example.controllers;

import com.example.repositories.CustomerRepository;
import com.example.repositories.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor


public class EventController {

    private EventRepository eventRepository;

    @GetMapping("/events")
    public String findAll(Model model){

        model.addAttribute("events", eventRepository.findAll());
        return"event/event-list";
    }
}
