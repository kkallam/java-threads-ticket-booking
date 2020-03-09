package com.koti.pack;

public class TicketBookingThread extends Thread {

	private TicketCounter ticketCounter;
	private String passerngerName;
	private int noofSeatsRequired;
	
	public TicketBookingThread(TicketCounter ticketCounter, String passerngerName, int noofSeatsRequired) {
		super();
		this.ticketCounter = ticketCounter;
		this.passerngerName = passerngerName;
		this.noofSeatsRequired = noofSeatsRequired;
	}
	
	public void run() {
		
		try {
			ticketCounter.bookTicket(passerngerName, noofSeatsRequired);
			int totalRemainingSeats = ticketCounter.getTotalAvailableSeats();
			//Thread.sleep(2000);
			System.out.println("Remaining available seats are: " + totalRemainingSeats);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
