package com.techelevator;

public class BankAccount
{
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	
	public BankAccount(String accountHolderName, String accountNumber)
	{
		
	}
	
	public BankAccount(String accountHolderName, String accountNumber, int balance)
	{
		
	}
	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public int deposit(int amountToDeposit)
	{
		
		int increasedBalance = amountToDeposit + this.getBalance();
		
		return increasedBalance;
	}
	
	public int withdraw(int amountToWithdraw)
	{
		
	}
	
	
	
	
}
