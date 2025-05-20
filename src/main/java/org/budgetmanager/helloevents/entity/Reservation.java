package org.budgetmanager.helloevents.entity;

import ch.qos.logback.core.net.server.Client;

import java.util.Date;

public class Reservation {
    private long id;
    private String event;
    private Date date;
    private Client client;
}
