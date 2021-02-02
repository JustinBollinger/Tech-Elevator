package com.techelevator.views;

import java.util.List;

import com.techelevator.models.Product;

public class UserOutput
{
	public static void displayWelcome()
	{
		System.out.println("Welcome to The Vendor");
	}
	
	public static void displayProducts(List<Product> products)
	{
		System.out.println();
		System.out.println("-----------Products----------");
		
		for (Product product : products)
		{
			// finish foreach loop
		}
	}
	
	
	public static void displayProductDetails(Product product)
	{
		System.out.println();
		System.out.println("--------Selected Product----------");
		System.out.println();
		
		System.out.println("Slot: " + product.getSlot());
		System.out.println("Id: " + product.getId());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());
		System.out.println("Type: " + product.getType());
	}

}
