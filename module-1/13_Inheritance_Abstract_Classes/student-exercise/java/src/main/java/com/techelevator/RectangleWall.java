package com.techelevator;

public class RectangleWall extends Wall
{
	// instance variables
	private int length;
	private int height;
	
	
	// getters
	public int getLength()
	{
		return length;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	
	// constructor
	public RectangleWall(String name, String color, int length, int height)
	{
		super(name, color);
		
		this.length = length;
		this.height = height;
		
		this.shapeChoice = "rectangle";
		this.shapeSize = length + "x" + height;
	}
	
	
	// methods
	public int getArea()
	{
		return height * length;
	}	
}
