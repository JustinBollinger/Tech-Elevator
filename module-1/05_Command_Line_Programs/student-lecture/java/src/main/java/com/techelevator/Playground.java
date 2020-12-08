package com.techelevator;

import java.util.Scanner;

public class Playground
{
	// where my program starts
	// entry point to the application
	// the metaphorical "front door" of the "house"
	public static void main(String[] args)
	{
		// System.out => output stream - to console
		// System.in => input stream - from console (raw data)
		
		// in order to read from System.in we need a Scanner
		
		// scanner data type knows how to read a stream.
		// *In order to receive input from the user, we need a Scanner.
		Scanner scanner = new Scanner(System.in);
		
		// get child's name
		System.out.print("Please enter the child's name: ");
		String name = scanner.nextLine();
		
		// get the child's age
		System.out.print("Please enter the child's age: ");
		String ageInput = scanner.nextLine();
		// take the user input and extract an int from it
		int age = Integer.parseInt(ageInput);
		
		//call the function that determines what age group
		String ageGroup;
		ageGroup = determineAgeGroup(age);
		
		// displaying output to the user
		System.out.println("Name: " + name);
		System.out.println("Age group: " + ageGroup);
		
		
	}
	
	// Age Groups:
	// < 10 can't register
	// 10-11 mighty mites
	// 12-13 bantam
	// 14-15 juniors
	public static String determineAgeGroup(int age)
	{
		String nameOfAgeGroup;
		
		if(age < 10)
		{
			nameOfAgeGroup = "too young to play";
		}
		else if(age <= 11)
		{
			nameOfAgeGroup = "Mighty Mites";
		}
		else if(age <= 13)
		{
			nameOfAgeGroup = "Bantam";
		}
		else if(age <= 15)
		{
			nameOfAgeGroup = "Junior";
		}
		else
		{
			nameOfAgeGroup = "too old to play";
		}
		return nameOfAgeGroup;
	}
}
