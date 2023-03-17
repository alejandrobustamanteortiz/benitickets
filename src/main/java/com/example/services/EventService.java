package com.example.services;


import com.example.entities.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {

    List<Event> findAll();

    Optional<Event> findById(Long id);

    Event save(Event event);

    void deleteById(Long id);
}
