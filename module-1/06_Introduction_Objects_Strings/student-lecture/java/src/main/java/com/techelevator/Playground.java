package com.techelevator;

public class Playground
{
	public static void main(String[] args)
	{
		String name1 = new String("Justin");
		String name2 = new String("justin");
		
		// this ends up being false because they are stored at
		// different areas on the heap. We're not asking if the values
		// are the same, we're asking 'do you live at the same place?' and
		// the answer is no. Two different objects.
		boolean areEqual = name1 == name2;
		
		System.out.println("name1 == name2: " + areEqual);
		
		// this doesn't mean 'are you the same object?'.
		// it means 'are the same values stored within each String?'
		boolean haveSameValue = name1.equalsIgnoreCase(name2);
		System.out.println("name1.equals(name2): " + haveSameValue);
		
		int[] numbers = new int[] {1,2,3,4,5};
		
		int first = numbers[0];
		
		// can use .charAt(); allows me to find a specific letter in a string
		char firstLetter = name1.charAt(0);
		
		for (int i = 0; i < name1.length(); i++)
		{
			System.out.println(name1.charAt(i));
		}
		
		// Strings are immutable means Strings CANNOT change.
		// really means, it is not changing the value of the memory block.
		// it is actually getting rid of the old block and creating a
		// brand new memory block with the new value.
		name1 = "John";
		System.out.println(name1);
		
		// can do this, but it adds and moves around memory.
		// concatenating often can lead to a huge memory drain
		name1 += " ";
		name1 += "Bollinger";
		System.out.println(name1);
		
		// these are 'literals'. A nuance of Java is that it will take
		// these literals and equate them as equal. Any time you hard code
		// values, they'll always be equal.
		// If you get input from a user, they'll never be equal because
		// it views each input as a different value.
		// When comparing strings, use new String and ignoreCase.
		String name3 = "Justin";
		String name4 = "Justin";
		
		areEqual = name3 == name4;
		
		System.out.println("Name 3 = Name 4: " + areEqual);
	}
}
