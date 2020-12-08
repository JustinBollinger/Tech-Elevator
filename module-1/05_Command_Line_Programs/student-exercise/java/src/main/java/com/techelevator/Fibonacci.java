package com.techelevator;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		// helper objects
		Scanner scanner = new Scanner(System.in);
		
		// variables
		String input;
		int maxValue;
		String fibonacciSequence = " ";
		
		// get user input
		System.out.print("What is the max fibonacci number you want? ");
		input = scanner.nextLine();
		maxValue = Integer.parseInt(input);
		
		// perform the calculations
		fibonacciSequence = calculateFibonacciSequence(maxValue);
		
		
		// display the output
		System.out.println();
		System.out.println("The fibonacci sequence for " + maxValue + " is: ");
		System.out.println(fibonacciSequence);	
	}
	
	
	
	public static String calculateFibonacciSequence(int maxValue)
	{
		String sequence = "0 ";
		int first = 0;
		int second = 1;
		
		while(second <= maxValue)
		{
			// add the numbers BEFORE you do the increment!
			sequence += second + " ";
			
			int temporaryVariable = first + second;
			first = second;
			second = temporaryVariable;
		}
		
		return sequence;
	}
}