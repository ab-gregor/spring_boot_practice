package com.spring_boot_practice.spring_boot_practice.TicketDao;

import com.spring_boot_practice.spring_boot_practice.Schema.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
