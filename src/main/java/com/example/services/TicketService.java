package com.example.services;

import com.example.entities.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    //CRUD

    List<Ticket> findAll();

    Optional<Ticket> findById(Long id);

    Ticket save(Ticket ticket);

    void deleteById(Long id);

}
