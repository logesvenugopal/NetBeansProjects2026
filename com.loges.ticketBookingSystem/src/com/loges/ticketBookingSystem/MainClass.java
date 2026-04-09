package com.loges.ticketBookingSystem;

import java.util.Scanner;

public class MainClass extends TransportExtension {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		MainClass m = new MainClass();
		m.menu();
	}
	
	void menu()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Below option anyone: ");
				
		System.out.println("1. City Bus Booking ");
		System.out.println("2. Luxury Bus Booking ");
		System.out.println("3. Calculate Fare ");
		System.out.println("4. Display Ticket ");
		System.out.println("5. Exit ");
		
		int option = sc.nextInt();
		
		System.out.println("Enter  Passenger Id: ");
		this.passengerId=sc.nextInt();
		
		System.out.println("Enter  Passenger Name: ");
		this.passengerName=sc.nextLine();
		
		if(option==1)
		{
			cityBusBooking();
		}
		else if(option==2)
		{
			luxuryBusBooking();
		}
		else if(option==3)
		{
			calculateFare();
		}
		else if(option==4)
		{
			displayTicket();
		}
		else
		{
			System.out.println("Exit"); 
		}
	}
		void cityBusBooking()
		{
			  System.out.println("Select the Route: ");
			  
			  System.out.println("1. Chennai to Bangalore");
			  System.out.println("2. Chennai to Coimbatore");
			  System.out.println("3. Chennai to Madurai");
			  System.out.println("4. Chennai to Trichy");
			  System.out.println("5. Chennai to salem");
			  
			  System.out.println("Enter your Choice:  ");
			 			  
			  int choice = sc.nextInt();
			  			  
			  if(choice==1)
			  {
				  System.out .println("Chennai to Bangalore    Ticket Booked Successfulyy");
			  }
			  else if(choice==2)
			  {
				  System.out .println("Chennai to Coimbatore    Ticket Booked Successfulyy");
			  }
			  else if(choice==3)
			  {
				  System.out .println("Chennai to Madurai      Ticket Booked Successfulyy");
			  }
			  else if(choice==4)
			  {
				  System.out .println("Chennai to Trichy    Ticket Booked Successfulyy");
			  }
			  else if(choice==5)
			  {
				  System.out .println(" Chennai to salem   Ticket Booked Successfulyy");
			  }
		}
		
		void luxuryBusBooking()
		{
			 System.out.println("Select the Route: ");
			  
			  String  route1= "1. Chennai to Bangalore";
			  String  route2= "2. Chennai to Coimbatore";
			  String  route3= "3. Chennai to Madurai";
			  String  route4= "4. Chennai to Trichy";
			  String  route5="5. Chennai to salem";
			  
			  System.out.println("Enter your Choice:  ");
			 			  
			  int choice = sc.nextInt();
			  			  
			  if(choice==1)
			  {
				  System.out .println(route1+" Ticket Booked Successfulyy");
			  }
			  else if(choice==2)
			  {
				  System.out .println(route2+" Ticket Booked Successfulyy");
			  }
			  else if(choice==3)
			  {
				  System.out .println(route3+" Ticket Booked Successfulyy");
			  }
			  else if(choice==4)
			  {
				  System.out .println(route4+" Ticket Booked Successfulyy");
			  }
			  else if(choice==5)
			  {
				  System.out .println(route5+" Ticket Booked Successfulyy");
			  }
		}
		
		String calculateFare() 
		{
			fare = distance*5;
			System.out.println("Your Fare is: "+fare);
			return "Ticket Fare is calculated Successfully";
		}
		
		void displayTicket()
		{
			fare = (distance*10)+200;  
			
			System.out.println("Passenger Id: "+ this.passengerId);
			System.out.println("Passenger Name: "+this.passengerName);
			System.out.println("Fare: "+ fare);
		}
		
		
	}

	


