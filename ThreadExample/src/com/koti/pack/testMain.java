package com.koti.pack;

public class testMain {

	public static void main(String[] args) {
		TicketCounter ticketCounter = new TicketCounter();
		TicketBookingThread t1 = new TicketBookingThread(ticketCounter, "Koti", 3);
		TicketBookingThread t2 = new TicketBookingThread(ticketCounter, "San", 4);
		
		t1.start();
		t2.start();
	
	}

}
