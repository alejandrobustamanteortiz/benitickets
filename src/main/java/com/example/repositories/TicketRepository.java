package com.example.repositories;

import com.example.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketRepository extends JpaRepository<Ticket, Long> {

}