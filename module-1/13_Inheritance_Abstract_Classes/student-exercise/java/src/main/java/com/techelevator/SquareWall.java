package com.techelevator;

public class SquareWall extends RectangleWall
{

	// constructor
	public SquareWall(String name, String color, int sideLength)
	{
		super(name, color, sideLength, sideLength);
		
		this.shapeChoice = "square";
	}
}
