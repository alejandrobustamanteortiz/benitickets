package com.example.controllers;

import com.example.entities.Event;
import com.example.repositories.EventRepository;
import com.example.services.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
@AllArgsConstructor


public class EventController {

    private EventRepository eventRepository;
    private EventService eventService;

    @GetMapping("/events")
    public String findAll(Model model){

        model.addAttribute("events", eventRepository.findAll());
        return"event/event-list";
    }

    @GetMapping("/events/{id}")
    public String findById(Model model, @PathVariable Long id){
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()){
            model.addAttribute("eventsId", optionalEvent.get());
            model.addAttribute("totalDays", eventService.totalDaysEvent(optionalEvent.get()));
        } else {
            model.addAttribute("error", "Not found");
        }
        return"event/event-detail";
    }
    @GetMapping("/events/{id}/delete")
    public String deleteById(@PathVariable Long id){
        eventRepository.deleteById(id);
        return "redirect:/events";
    }

    @GetMapping("/events/{id}/showEventForm")
    public String editForm(Model model, @PathVariable Long id){
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()){
            model.addAttribute("eventsId", optionalEvent.get());
        } else {
            model.addAttribute("error", "Not found");
        }
        return"event/event-form";
    }
}
