package com.techelevator;

import java.util.Scanner;

public class TempConvert
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the temperature you'd like to convert?");
		String tempToConvert = scanner.nextLine();
		double tempAnswer = Double.parseDouble(tempToConvert);
		
		System.out.println("Is that F or C?");
		String degreesOrCelsius = scanner.nextLine();
		
//		if (degreesOrCelsius.toUpperCase().startsWith("F"))
//		{
//			int fahrToCel = (int)
//			
//		}

	}

}
