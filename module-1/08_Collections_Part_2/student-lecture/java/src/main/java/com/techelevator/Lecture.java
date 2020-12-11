package com.techelevator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

//		Map <K, V>
		
		// remember the hash ids. HashMap creates a Map of Hashes.
//		Map<Integer, String> students = new HashMap<Integer, String>();
//		
//		// this adds, or "puts" an item onto the Map.
//		students.put(1, "Justin");
//		
		// creates a Map with <K, V> of <String, String>
		// a HashMap of String keys and String values
		Map<String, String> dailySpecials = new LinkedHashMap<String, String>();
		
		dailySpecials.put("Monday", "Waffles");
		dailySpecials.put("Tuesday", "Pancakes");
		dailySpecials.put("Wednesday", "French Toast");
		dailySpecials.put("Thursday", "Liver");
		dailySpecials.put("Friday", "Sausage and Eggs");
		dailySpecials.put("Saturday", "Waffles");
		dailySpecials.put("Sunday", "Pancakes");
		
		
		
		// you look up, or .get, by KEY! because keys are UNIQUE
		String tuesdaySpecial = dailySpecials.get("Tuesday");
		
		
		
		
		System.out.println("Tuesday's Special: " + tuesdaySpecial);
		
		// if you use the same key again, it will REPLACE whatever
		// is at that key.
		dailySpecials.put("Monday", "Liver");
		
		
		String mondaySpecial = dailySpecials.get("Monday");
		System.out.println("Monday's Special: " + mondaySpecial);
		
		// in a List, this will work because it's trying
		// to loop through each index position. i = the index position.
		// CANNOT LOOP LIKE THIS THROUGH MAPS BECAUSE THERE ARE NO INDEX POSITIONS
//		for(int i = 0; i < dailySpecials.size(); i++)
//		{
//			dailySpecials.get(i);
//		}
		
		System.out.println();
		System.out.println();
		System.out.println("####################");
		System.out.println("        KEYS");
		System.out.println("####################");
		System.out.println();
		System.out.println();
		
		
		// CAN loop with this. Can access all the keys and then refer
		// to each key individually.
		// the keys of a map are a set.
		// we can use the keySet() function to get all keys
		Set<String> keys = dailySpecials.keySet();
		
		
		// does not return in order of how we entered the keys due to
		// the fact that we are using a HashMap.
		
		
		
		for(String key : keys)
		{
			String special = dailySpecials.get(key);
			System.out.println(key + " : " + special);
		}
		
		//HashMap uses Hash values to sort
		//TreeMap goes by alphabetical order of the Strings
		//LinkedHashMap goes by the order we entered them
		
		
		
		
		
		
	}

}
