package com.techelevator;

public class CheckingAccount extends BankAccount
{
	public CheckingAccount(String accountHolder, String accountNumber)
	{
		super(accountHolder, accountNumber);
	}
	
	public CheckingAccount(String accountHolder, String accountNumber, int balance)
	{
		super(accountHolder, accountNumber, balance);
	}
	
	
	public int withdraw(int amountToWithdraw)
	{
		
		int newBalance = getBalance() - amountToWithdraw;
		
		if(newBalance < -100)
		{
			return getBalance();
		}
		else if(newBalance < 0)
		{
			amountToWithdraw += 10;
		}
		
		return super.withdraw(amountToWithdraw);
				
	}
	
	
	
	
	
	
	
	
	
	

}
