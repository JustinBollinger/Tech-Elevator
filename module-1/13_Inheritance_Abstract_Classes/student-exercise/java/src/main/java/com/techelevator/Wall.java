package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public abstract class Wall
{
	// instance variables
	protected String shapeChoice;
	protected String shapeSize;
	
	private String name;
	private String color;
	List<Wall> walls = new ArrayList<Wall>();
	
	
	// getters
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	
	// constructor
	public Wall(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	
	// method
	public abstract int getArea();
	
	@Override
	public String toString()
	{
		return name + " (" + shapeSize + ") " + shapeChoice;
	}
	
}
