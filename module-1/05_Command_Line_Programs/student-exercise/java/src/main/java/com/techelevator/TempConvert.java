package com.techelevator;

import java.util.Scanner;

public class TempConvert
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the temperature you would like to convert?");
		String tempToConvert = scanner.nextLine();
		double tempAnswer = Double.parseDouble(tempToConvert);	
		
		System.out.print("Is your measurement Fahrenheit or Celsius? ");
		String degreesOrCelsius = scanner.nextLine();	
		
		if (degreesOrCelsius.toUpperCase().startsWith("F"))
		{
			double fahrToCel = ((tempAnswer - 32) / 1.8); 
			System.out.println(tempAnswer + "F converts to " + fahrToCel + "C.");
		}
		if (degreesOrCelsius.toUpperCase().startsWith("C"))
		{
			double celToFahr = ((tempAnswer * 1.8) +32);
			System.out.println(tempAnswer + "C converts to " + celToFahr + "F.");
		}
	}
}
