package com.adepuu.exercises.session7;

public class TicketingSystem {

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("1","Collabora", 195000, 5000);
        Ticket ticket2 = new Ticket("2","Jazz Goes to Campus", 100000, 1500);
        Ticket ticket3 = new Ticket("3", "Orewa Oriza", 225000, 7500);
        ticket1.printTicketInfo();
        ticket2.printTicketInfo();
        ticket3.printTicketInfo();
        Purchaser purchaser1 = new Purchaser("Alison");
        purchaser1.buyTicket(ticket1,5001);
        ticket1.getTicketStock();
    }
}

class Ticket {
    private String ticketID;
    private String ticketEvent;
    private int ticketPrice;
    protected int ticketStock;

    public Ticket(String ticketID, String ticketEvent, int ticketPrice, int ticketStock) {
        this.ticketID = ticketID;
        this.ticketEvent = ticketEvent;
        this.ticketPrice = ticketPrice;
        this.ticketStock = ticketStock;
    }

    public void printTicketInfo() {
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Event name: " + ticketEvent);
        System.out.println("Price: Rp " + ticketPrice);
        System.out.println("Remaining available tickets: " + ticketStock + " ea");
    }
    public void getTicketStock () {
        System.out.println("The remaining ticket for Event " + ticketEvent + " is: " + ticketStock);
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