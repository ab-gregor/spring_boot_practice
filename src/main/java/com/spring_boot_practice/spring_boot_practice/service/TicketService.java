package com.spring_boot_practice.spring_boot_practice.service;

import com.spring_boot_practice.spring_boot_practice.Schema.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    String bookTicket(List<Ticket> tickets);

    List<Ticket> getTickets();

    Optional<Ticket> getTicket(Integer ticketId);
}
