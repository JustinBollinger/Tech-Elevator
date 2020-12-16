package com.techelevator;

public class CreditCardAccount implements Accountable
{
	private String accountHolder;
	private String accountNumber;
	private int getBalance;
	private int debt;

	// constructor
	public CreditCardAccount(String accountHolder, String accountNumber)
	{
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.debt = debt;
	}	
	
	public String getAccountHolder()
	{
		return accountHolder;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public int getDebt()
	{
		return debt;
	}

	public int pay(int amountToPay)
	{
		debt = getDebt() - amountToPay;
		return debt;
	}
	
	public int charge(int amountToCharge)
	{
		debt = getDebt() + amountToCharge;
		return debt;
	}

//	public List


	@Override
	public int getBalance()
	{
		return -debt;

	}

}
