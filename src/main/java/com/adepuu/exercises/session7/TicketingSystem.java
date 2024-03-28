package com.adepuu.exercises.session7;

import java.util.HashMap;

public class TicketingSystem {

    public static void main(String[] args) {
    }
}

class Event {
    private HashMap<String, Ticket> eventTickets;
    private String eventName;

    public Event() {
        this.eventName = eventName;
        this.eventTickets = new HashMap<>();
    }

    public void createEvent(String eventName, Ticket ticket) {
        eventTickets.put(eventName, ticket);
    }
}

class Ticket {
    private String ticketID;
    private String type;
    private double price;
    private int originalQuantity;


    public Ticket(String type, double price, int originalQuantity) {
        this.type = type;
        this.price = price;
        this.originalQuantity = originalQuantity;
        this.ticketID = "ID_" +

    }

}

class Purchaser {
    private String name;

    public Purchaser(String name) {
        this.name = name;
    }

    public void buyTicket(Ticket ticketType, int buyQuantity) {
        if (buyQuantity <= ticketType.ticketStock) {
            ticketType.ticketStock -= buyQuantity;
            System.out.println("Your purchase has been confirmed.");
        } else if (buyQuantity > ticketType.ticketStock) {
            System.out.println("The buying quantity (" + buyQuantity + ") exceeds the remaining ticket. Available ticket is only " + ticketType.ticketStock);
        } else {
            System.out.println("We deeply apologize, the ticket has already been sold out.");
        }

    }
}