package com.spring_boot_practice.spring_boot_practice.controller;

import com.spring_boot_practice.spring_boot_practice.Schema.Ticket;
import com.spring_boot_practice.spring_boot_practice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/bookTickets")
    public String bookTickets(@RequestBody List<Ticket> tickets) {
        return ticketService.bookTicket(tickets);
    }


    @GetMapping("/getTickets")
    public List<Ticket> bookTickets() {
        return ticketService.getTickets();
    }


    @GetMapping("/getTicket")
    public Optional<Ticket> bookTickets(@RequestParam("ticketId") Integer ticketId) {
        return ticketService.getTicket(ticketId);
    }

}
