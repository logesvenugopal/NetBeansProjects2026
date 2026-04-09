package com.loges.bankingManagementSystems;

public class BankAccount {
	
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public long getAccountNumber()
	{
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double depositAmount(double amount)
	{
		balance=amount+balance;
		return balance;
		
	}
	
	public double withdrawAmount(double withdraw)
	{
		balance = balance-withdraw;
		return balance;
	}
	
	 public void displayAccountDetails(BankAccount ba )
	 {
		 System.out.println("Account Number: "+ba.accountNumber);
		 System.out.println("Account Holder Name: "+ba.accountHolderName);
		 System.out.println("Balance: "+ba.balance);
	 }
	 
	 public BankAccount(long accountNumber,String accountHolderName,double balance)
	 {
		 this.accountNumber=accountNumber;
		 this.accountHolderName=accountHolderName;
		 this.balance=balance;
	 }

	

}
