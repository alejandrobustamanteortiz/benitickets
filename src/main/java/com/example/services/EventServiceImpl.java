package com.example.services;

import com.example.entities.Event;
import com.example.repositories.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class EventServiceImpl implements EventService {

    EventRepository eventRepository;

    //CRUD METHODES

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }

    @Override
    public Event save(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }



    //LOGICA DE NEGOCIO

    @Override
    public Long totalDaysEvent(Event event) {
    return ChronoUnit.DAYS.between(event.getInitDate(), event.getEndDate().plusDays(1));
    }
}
