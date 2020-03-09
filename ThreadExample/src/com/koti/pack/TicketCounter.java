package com.koti.pack;

public class TicketCounter {
	private int totalAvailableSeats = 10;
	
	public synchronized void bookTicket(String pName, int noofSeats) throws InterruptedException {
		if ((totalAvailableSeats >= noofSeats) && (noofSeats > 0)) {
			System.out.println("Hi, " + pName + " your " + noofSeats + " are booked Successfully!!");
			totalAvailableSeats = totalAvailableSeats - noofSeats;
			
			
		} else {
			System.out.println("Transaction failed!! No sewats available");
		}
		//Thread.sleep(2000);
	}

	public int getTotalAvailableSeats() {
		return totalAvailableSeats;
	}
	
	

}
