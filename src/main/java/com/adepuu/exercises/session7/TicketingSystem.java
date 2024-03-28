package com.adepuu.exercises.session7;

import java.util.HashMap;

public class TicketingSystem {
    public static void main(String[] args) {
        Event event1 = new Event("Event 1");
        Purchaser user1 = new Purchaser("Alibaba");
        event1.purchaseTicket(user1, "Premium");
    }
}

class Event {
    private HashMap<String, Integer> ticketsAvailable;
    private String eventName;
    private int numID;

    public Event(String eventName) {
        this.eventName = eventName;
        this.ticketsAvailable = new HashMap<>();
        this.ticketsAvailable.put("Standard", 50);
        this.ticketsAvailable.put("Premium", 20);
        this.ticketsAvailable.put("Pertamax", 10);
        this.numID = 0;
    }

    public String generateID(){
        String ticketID = "ID_" + numID;
        numID++;
        return ticketID;
    }

    private double getPriceTicket(String type) {
        switch (type) {
            case "Standard": return 50000;
            case "Premium": return 150000;
            case "Pertamax": return 300000;
            default: return 0;
        }
    }

    public void purchaseTicket(Purchaser user, String type) {
        if (ticketsAvailable.containsKey(type) && ticketsAvailable.get(type) > 0) {
            if (user.hasPurchasedTicket()) {
                System.out.println("Sorry, but one user can only purchase 1 ticket of any type.");
                return;
            }
            int available = ticketsAvailable.get((type));
            ticketsAvailable.put(type, available - 1);
            double price = getPriceTicket(type);
            String ticketID = generateID();
            user.addTicket(new Ticket(type, ticketID, price), eventName, getPriceTicket(type));
        } else {
            System.out.println("Sorry, tickets for " + type + " type is not available or no longer available.");
        }
    }
}

class Ticket {
    private String ticketID;
    private String type;
    private double price;


    public Ticket(String type, String ticketID, double price) {
        this.type = type;
        this.ticketID = ticketID;
        this.price = price;
    }

    public String getTicketID() {
        return ticketID;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

class Purchaser {
    private String name;
    private HashMap<String, Ticket> ticketUser;
    private boolean purchasedTicket;

    public Purchaser(String name) {
        this.name = name;
        this.ticketUser = new HashMap<>();
        this.purchasedTicket = false;
    }

    public void addTicket (Ticket ticket, String eventName, double price) {
        ticketUser.put(ticket.getType(), ticket);
        purchasedTicket = true;
        System.out.println("A ticket has been purchased." +
                "\nEvent name: " + eventName +
                "\nTicket type: " + ticket.getType() +
                "\nTicket ID: " + ticket.getTicketID() +
                "\nPrice: Rp " + price +
                "\nYour name: " + name);
    }

    public boolean hasPurchasedTicket() {
        return purchasedTicket;
    }
}