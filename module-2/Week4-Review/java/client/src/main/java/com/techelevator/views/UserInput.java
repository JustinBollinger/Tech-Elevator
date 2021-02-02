package com.techelevator.views;

import java.nio.channels.SelectableChannel;
import java.util.List;
import java.util.Scanner;

import com.techelevator.models.Product;

public class UserInput
{
	protected static Scanner console = new Scanner(System.in);
	
	public static int getHomeMenuOption()
	{
		System.out.println("What would you like to do?");
		System.out.println();
		
		System.out.println("1) Display Products");
		System.out.println("2) Select Product");
		System.out.println("0) Exit");
		
		System.out.println();
		System.out.print("Please select an option: ");
		
		int selection = Integer.parseInt(console.nextLine());
		System.out.println();
		
		return selection;
	}
	
	public static int getProductSelection(List<Product> products)
	{
		System.out.println();
		System.out.println("Select a product: ");
		
		String slot =console.nextLine();
		System.out.println();
		
		// look for the product in the slot
		for (Product product : products)
		{
			if(product.getSlot().equalsIgnoreCase(slot))
			{
				return product.getId();
			}
		}
		//not ideal, but for now that's how we'll deal with it
		return -1;
	}

}
