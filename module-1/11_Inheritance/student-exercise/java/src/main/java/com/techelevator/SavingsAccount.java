package com.techelevator;

public class SavingsAccount extends BankAccount
{
	
	public SavingsAccount(String accountHolder, String accountNumber)
	{
		super(accountHolder, accountNumber);
	}
	
	public SavingsAccount(String accountHolder, String accountNumber, int balance)
	{
		super(accountHolder, accountNumber, balance);
	}
	
	public int withdraw(int amountToWithdraw)
	{
		int newBalance = getBalance() - amountToWithdraw;
		
		if(newBalance < 0)
		{
			return super.getBalance();
		}
		else if(newBalance < 150)
		{
			amountToWithdraw += 2;
		}
		return super.withdraw(amountToWithdraw);
		
	}
	
	
	
}
