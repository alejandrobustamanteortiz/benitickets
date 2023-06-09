package com.example.controllers;

import com.example.entities.Ticket;
import com.example.repositories.TicketRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class TicketController {

    //Mostrar todos
    private TicketRepository ticketRepository;

    @GetMapping("/tickets")
    public String findAll(Model model) {

        model.addAttribute("tickets", ticketRepository.findAll());

        return "ticket/ticket-list";
    }

    //Ver ticket
    @GetMapping("/tickets/{id}")
    public String findById(Model model, @PathVariable Long id) {

        Optional<Ticket> optionalTicket = ticketRepository.findById(id);
        if (optionalTicket.isPresent()) {
            model.addAttribute("ticketId", optionalTicket.get());
        } else {
            model.addAttribute("error", "Not found");
        }
        return "ticket/ticket-detail";
    }

    //Borrar ticket de la lista
    @GetMapping("/tickets/{id}/delete")
    public String deleteById(Model model, @PathVariable Long id) {
        ticketRepository.deleteById(id);
        return "redirect:/tickets";
    }

    //Mostrar formulario edit

    @GetMapping("/tickets/{id}/showEditForm")
    public String showEditForm(Model model, @PathVariable Long id) {

        Optional<Ticket> optionalTicket = ticketRepository.findById(id);
        if (optionalTicket.isPresent()) {
            model.addAttribute("ticketId", optionalTicket.get());
        } else {
            model.addAttribute("error", "Not found");
        }
        return "mantenimiento-web";
    }


}
