package com.techelevator;

public class TriangleWall extends Wall
{
	// new instance variables
	public int base;
	public int height;
	
	// constructor
	public TriangleWall(String name, String color, int base, int height)
	{
		super(name, color);
		
		this.base = base;
		this.height = height;
		
		this.shapeChoice = "triangle";
		this.shapeSize = base + "x" + height;
	}
	
	// new getter
	public int getBase()
	{
		return base;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	// method
	public int getArea()
	{
		return (height * base) / 2;
	}	
		
		
		
}

