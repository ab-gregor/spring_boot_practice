package com.spring_boot_practice.spring_boot_practice.service;


import com.spring_boot_practice.spring_boot_practice.TicketDao.TicketDao;
import com.spring_boot_practice.spring_boot_practice.Schema.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDao ticketDao;
    @Override
    public String bookTicket(List<Ticket> tickets) {

         ticketDao.saveAll(tickets);
         return "Successfully booked tickets"+ tickets.size();

    }

    @Override
    public List<Ticket> getTickets() {
         return (List<Ticket>)ticketDao.findAll();
    }

    @Override
    public Optional<Ticket> getTicket(Integer ticketId) {
     //   Assert.notNull(ticketId, "TicketId cannot be null");

/*        Assert.isInstanceOf(Integer.class,ticketId, "TicketId should be integer")*/;

       return (Optional<Ticket>) ticketDao.findById(ticketId);
    }
}
