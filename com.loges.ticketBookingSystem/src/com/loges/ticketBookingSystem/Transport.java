package com.loges.ticketBookingSystem;

public abstract class Transport {
	
	int passengerId;
	String passengerName;
	String fromCity;
	String toCity;
	int distance;
	int fare;
	
	abstract String calculateFare();
	
	void displayTicket()
	{
		fare = (distance*10)+200;  
	}
	

}
