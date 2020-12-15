package com.techelevator;

public class FruitTree
{
	// what does it know?
	// instance variables go here
	// these variables belong to this class.
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	
	// not sure what to do with startingPiecesOfFruit in ctor, if anything,
	// since it was not established as an instance variable
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit)
	{
		this.typeOfFruit = typeOfFruit;
	}
	
	public String gettypeOfFruit()
	{
		return typeOfFruit;
	}
	
	public int getPiecesOfFruitLeft()
	{
		return piecesOfFruitLeft;
	}
	
	
	// logic not right
	public boolean pickFruit(int numberOfPiecesToRemove)
	{ 
		if (piecesOfFruitLeft > 0)
		{
			piecesOfFruitLeft -=  numberOfPiecesToRemove;
			return true;
		}
		if(piecesOfFruitLeft < numberOfPiecesToRemove)
		{
			return false;
		}
		return false;
	}
	
	
}
