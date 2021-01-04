package com.techelevator;

public class FruitTree
{
	// what does it know?
	// instance variables go here
	// these variables belong to this class.
	private String typeOfFruit;
	private int piecesOfFruitLeft;

	// constructor
	public FruitTree(String newTypeOfFruit, int startingPiecesOfFruit)
	{
		typeOfFruit = newTypeOfFruit;
		piecesOfFruitLeft = startingPiecesOfFruit;

	}

	// getters
	public String getTypeOfFruit()
	{
		return typeOfFruit;
	}

	public int getPiecesOfFruitLeft()
	{
		return piecesOfFruitLeft;
	}

	// method
	public boolean pickFruit(int numberOfPiecesToRemove)
	{
		if (piecesOfFruitLeft > 0)
		{
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}
		if (piecesOfFruitLeft < numberOfPiecesToRemove)
		{
			return false;
		}
		return false;
	}

}
