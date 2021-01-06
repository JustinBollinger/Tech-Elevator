package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch
{

	public static void main(String[] args)
	{
		String filePath = getUserInput("What file would you like to search? ");
		String userWord	= getUserInput("What word would you like to search? ");
		String caseSensitivity = getUserInput("Is it case sensitive? (Y/N) ");
		File textFile = new File(filePath);
		Scanner scanner;
		
		try
		{
			scanner = new Scanner(textFile.getAbsoluteFile());
			int lineCounter = 1;
			while (scanner.hasNextLine())
			{
				String wordLine = scanner.nextLine();
				
				if (caseSensitivity.contentEquals("N"))
				{
					wordLine = wordLine.toLowerCase();
					userWord = userWord.toLowerCase();
					if(wordLine.contains(userWord))
					{
						System.out.println(lineCounter + ")" + wordLine);
					}
				}
				else if(wordLine.contains(userWord))
				{
					System.out.println(lineCounter + ")" + wordLine);
				}
				lineCounter++;

			}	
		}
		catch (FileNotFoundException e)
		{
			// TODO: handle exception
		}
	}
	
	public static String getUserInput(String input)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(input);
		String userInput = scanner.nextLine();
		return userInput;
	}
	
	public static void displayOutput(String output)
	{
		System.out.println(output);
		
	}

		
}
