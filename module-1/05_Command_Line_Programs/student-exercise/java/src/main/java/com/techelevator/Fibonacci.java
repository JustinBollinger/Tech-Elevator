package com.techelevator;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to see the Fibonacci sequence leading to that number:");
		String enterANumber = scanner.nextLine();
		
		int enteredNumber = Integer.parseInt(enterANumber);
		
		System.out.println(fibonacciSequence(enteredNumber));
	}
	public static int fibonacciSequence(int enteredNumber)
	{
		System.out.println("Fibonacci Sequence: ");
		int firstNumber = 0;
		int secondNumber = 1;
		int sum = 0;
		String fibNumbers = "0";
		
		if (enteredNumber == 0)
		{
			return 0;
		}
		else if (enteredNumber ==1)
		{
			return 1;
		}
		else 
		{
			while (enteredNumber >= sum)
			{
				
				firstNumber = secondNumber;
				secondNumber = sum;
				sum = firstNumber + secondNumber;
				String secondNumberString = String.valueOf(secondNumber);
				System.out.print(secondNumber + ", ");
			}
		}
		return secondNumber;
	}
	
}
