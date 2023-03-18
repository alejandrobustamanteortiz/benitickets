package com.example.controllers;

import com.example.repositories.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TicketController {

    private TicketRepository ticketRepository;
    @GetMapping("/tickets")
    public String findAll(Model model){

        model.addAttribute("tickets",ticketRepository.findAll());

        return"ticket/ticket-list";
    }
}
