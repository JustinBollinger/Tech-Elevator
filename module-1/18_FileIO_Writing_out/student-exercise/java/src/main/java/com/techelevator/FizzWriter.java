package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter
{
	public static void main(String[] args) {
		File textFile = new File("FizzBuzz.txt");
		String outputString = "";
		try(PrintWriter dataOutput = new PrintWriter(textFile)){
			for(int i = 1; i <= 300; i++){
				if (i % 15 == 0){
					outputString = "FizzBuzz.";
				} else if (i % 3 == 0 || Integer.toString(i).contains("3")) {
					outputString = "Fizz.";
				} else if (i % 5 == 0 || Integer.toString(i).contains("5")) {
					outputString = "Buzz.";
				} else {
					outputString = Integer.toString(i);
				}
				dataOutput.println(outputString);
			}
			System.out.println("FizzBuzz.txt has been created.");
		} catch (FileNotFoundException e) {
			System.out.println("");
			System.exit(1);
		}
	}
}