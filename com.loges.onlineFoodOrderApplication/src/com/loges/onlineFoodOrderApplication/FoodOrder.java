package com.loges.onlineFoodOrderApplication;

import java.util.Scanner;

public class FoodOrder extends Customer implements OrderFood{
	
	String CustomerName;
	 String foodItem;
	 int price;


	FoodOrder(String CustomerName,String foodItem, int price) {
		this.CustomerName=CustomerName;
		this.foodItem=foodItem;
		this.price=price;
		
	}

	
	@Override
	public void placeOrder() {
		
		System.out.println("Customer Name: "+CustomerName);
		System.out.println("Food Item: "+foodItem);
		System.out.println("price: "+price);
		
		
		System.out.println("Order Placed Successfully");
		
	}

	@Override
	public void showBill() {
		
		System.out.println("Your Bill Amount is: "+price);
		
	}
	
	
	
	

}
