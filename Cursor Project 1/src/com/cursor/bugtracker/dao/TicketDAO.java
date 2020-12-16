package com.cursor.bugtracker.dao;

import com.cursor.bugtracker.model.Ticket;

interface TicketDao {
    Ticket save(Ticket ticket);

    Ticket getById(String ticketId);

    boolean removeById(String ticketId);
}
