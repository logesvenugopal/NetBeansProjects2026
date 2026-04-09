package com.loges.bankingManagementSystems;

import java.util.Scanner;

public class BankOperations extends BankAccount {
	
	public BankOperations(long accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Scanner se = new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		long accountNumber = se.nextLong();
		
		System.out.println("Enter Account Holder Name:  ");
		String accountHolderName = se.nextLine();
		
		System.out.println("Enter Initial balace: ");
		double balance = se.nextDouble();
		
		BankOperations bank = new BankOperations(accountNumber,accountHolderName,balance);
		
		bank.menu();
		
	}
	
	public void menu()
	{
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Display Account Details");
		System.out.println("4.Exit");
		
		System.out.println("Choose anyone above operations");
		int option = sc.nextInt();
		
		double currentBalance;
		
		if(option==1)
		{
			System.out.println("Deposit Amount is: ");
			double dpAmount= sc.nextDouble();
			currentBalance=depositAmount(dpAmount);
			System.out.println(currentBalance);
		}
		else if(option==2)
		{
			System.out.println("Withdraw Amount is: ");
			double withdrawAmount= sc.nextDouble();
			currentBalance= withdrawAmount(withdrawAmount);
			System.out.println(currentBalance);
		}
		else if(option==3)
		{
			displayAccountDetails( );
		}
		else
		{
			
		}
		
	}

	private void displayAccountDetails() {
		
		
	}
	
	
	
	
}
