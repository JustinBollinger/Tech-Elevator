package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> names = new ArrayList<>();
		
		names.add("Wolverine");
		names.add("Iron Man");
		names.add("Captain America");
		names.add("Deadpool");
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		String firstHeroName = names.get(0); 
		System.out.println("The first hero is: " + firstHeroName);
		
		// .size() tells me how many elements I've actually used
		// within the List container. More efficient this way.
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		
		System.out.println();
		System.out.println();

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		System.out.println();
		System.out.println();
		
		
		names.add("Wolverine");
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		System.out.println();
		System.out.println();

		names.add(3, "The Incredible Hulk");
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		System.out.println();
		System.out.println();

		//remove by index
		//names.remove(2);
		names.remove("Wolverine");
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		System.out.println();
		System.out.println();
		
		boolean hasWolverine = names.contains("Wolverine");
		
		System.out.println("Wolverine is in list: " + hasWolverine);
		
		
		System.out.println();
		System.out.println();

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		System.out.println();
		System.out.println();
		
		// where is Wolverine?
		int wolverineIndex = names.indexOf("Wolverine");
		System.out.println("Wolverine was found at index: " + wolverineIndex);
		
		
		
		
		System.out.println();
		System.out.println();

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		System.out.println();
		System.out.println();
		
		// may or MAY not help with one exercise and
		// MIGHT make that exercise easier... lol
		// the .toArray function returns an array, but
		// we must allocate the memory on the heap by entering "new String[0];
		// creating an array of Strings at size 0.
//		String[] namesArray = names.toArray(new String[0]);
		
		// how to designate the size you've been using thus far
		String[] namesArray = names.toArray(new String[names.size()]);
		
		System.out.println("Looping through the array, NOT the list: ");
		for(int i = 0; i < namesArray.length; i++)
		{
			System.out.println(namesArray[i]);
		}
	
		
		
		
		
		System.out.println();
		System.out.println();

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		System.out.println();
		System.out.println();
		
		// null is default so it sorts alphabetical
		names.sort(null);
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		System.out.println();
		System.out.println();
		
		
		
		// Collections is a class
		// that has a library of common functions
		// that work with lists, such as .reverse.
		Collections.reverse(names);
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for(int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		
		// OUTPUT BETWEEN THE ABOVE AND BELOW LOOPS IS IDENTICAL
		
		// called a foreach loop -> for each String in the names list, do the loop
		// don't have as much control over the loop.
		// if wanted to skip every other element, can't do that here.
		// would need a standard loop.
		
		// if you just need to process every element in the array,
		// this is much more efficient and preferred.
		for(String name: names)
		{
			System.out.println(name);
		}
		
		// ^^^ for-each loop

	}
}
