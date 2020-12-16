package com.techelevator;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BankCustomer implements Accountable
{
	// instance variables
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>();
	
	// getters
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public Accountable[] getAccounts()
	{
		return accounts.toArray(new Accountable[accounts.size()]);
	}
	
	
	// setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public int getBalance()
	{
		return 0;
	}
	
	public void addAccount(Accountable newAccount)
	{
		accounts.add(newAccount);
	}
	
	
}
