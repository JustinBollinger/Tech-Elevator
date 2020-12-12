package com.techelevator.cardexample;

import java.util.function.IntUnaryOperator;

// name here MUST match the name of the file.
// classes are Pascal case, always start with upper case.
public class Card
{
	// instance variables go here.
	// what does it know?
	// anything it knows should ALWAYS be private.
	// this way, I have complete control over these variables
	// -----------
	// all private because they can only
	// be accessed within the class Card
	private String suit;
	private String faceValue;
	private int value;
	private boolean isFaceUp;
	
	
	
	// getters return the value
	// that's stored in the private variables
	// an example of a "getter"
	public String getSuit()
	{
		return suit;
	}
	
	public String getFaceValue()
	{
		return faceValue();
	}
	
	public int getValue()
	{
		return value();
	}
	
	public boolean isFaceUp()
	{
		return isFaceUp;
	}
	
	
	
	
	
	// setters change/set the value
	// of the private variables
	// void because we aren't returning anything
	// the purpose is to "set" a value.
	// an example of a "setter"
	public void setSuit(String newSuit) 
	{
		suit = newSuit;
	}
	
	
	
}
