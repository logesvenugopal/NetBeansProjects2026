package com.loges.onlineFoodOrderApplication;

import java.util.Scanner;

public class MainClass extends FoodOrder  {
	
	MainClass(String CustomerName, String foodItem, int price) {
		super(CustomerName,foodItem,price);
		
	}

	Scanner sc = new Scanner(System.in);
	
	// MainClass f;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter Customer Name: ");
		 String CustomerName= sc.nextLine();
		 
		 System.out.println("Enter Food Item: ");
		String foodItem= sc.nextLine(); 
		 
		 System.out.println("Enter Price: ");
		int  price = sc.nextInt();
		 
		MainClass  f = new MainClass(CustomerName,foodItem,price);
		f.menu(); 
		
		
		
		
	}
	
	void menu()
	{
				boolean result=true;
		do {
		System.out.println("1.Place Order");
		System.out.println("2.View Bill");
		System.out.println("3.Exit");
	
		System.out.println("Enter Your Choice:  ");
		int choice = sc.nextInt();
		
		if(choice==1)
		{
			placeOrder();
		}
		else if(choice==2)
		{
			showBill();
		}
		else
		{
			System.out.println("Order not in cart");
			result=false;
		}
		}while(result);
	
	}
	
	

}
