package com.techelevator.hotels;

import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

public class App
{
	// 'final' means it's a constant (won't ever change)
	// typical case is all caps for constants
	private static final String BASE_URL = "http://localhost:3000/";
	private static RestTemplate restTemplate = new RestTemplate();
	
	
	public static void main(String[] args)
	{
		run();
	}

	private static void run()
	{
		Hotel[] hotels = null;
		Scanner scanner = new Scanner(System.in);
		int menuSelection = 999;

		printGreeting();

		while (menuSelection != 0)
		{
			try
			{
				menuSelection = Integer.parseInt(scanner.nextLine());
			}
			catch (NumberFormatException exception)
			{
				System.out.println("Error parsing the input for menu selection.");
			}
			
			System.out.println("");
			if (menuSelection == 1)
			{
				// get all hotels from the API
				// and display them
				getHotels();
			}
			else if (menuSelection == 2)
			{
				getReviews();
			}
			else if (menuSelection == 3)
			{
				System.out.println("Enter a hotel id: ");
				int hotelId = Integer.parseInt(scanner.nextLine());
				getHotelById(hotelId);
			}
			else if (menuSelection == 4)
			{
				System.out.println("Enter a hotel id: ");
				int hotelId = Integer.parseInt(scanner.nextLine());
				getReviewsByHotelId(hotelId);
			}
			else if (menuSelection == 5)
			{
				System.out.println("Enter a rating to search for: ");
				int rating = Integer.parseInt(scanner.nextLine());
				getHotelsByRating(rating);
			}
			else if (menuSelection == 6)
			{
				System.out.println("Not implemented - Create a custom Web API query here");
			}
			else if (menuSelection == 0)
			{
				continue;
			}
			else
			{
				System.out.println("Invalid Selection");
			}
			menuSelection = 999;
			System.out.println("\nPress Enter to continue...");
			scanner.nextLine();
			printGreeting();
		}
		scanner.close();
		System.exit(0);
	}

	private static void printGreeting()
	{
		System.out.println("");
		System.out.println("Welcome to Tech Elevator Hotels. Please make a selection: ");
		System.out.println("1: List Hotels");
		System.out.println("2: List Reviews");
		System.out.println("3: Show Details for Hotel ID 1");
		System.out.println("4: List Reviews for Hotel ID 1");
		System.out.println("5: List Hotels with star rating 3");
		System.out.println("6: Custom Query");
		System.out.println("0: Exit");
		System.out.println("");
		System.out.print("Please choose an option: ");
	}

	private static void printHotels(Hotel[] hotels)
	{
		System.out.println("--------------------------------------------");
		System.out.println("Hotels");
		System.out.println("--------------------------------------------");
		for (Hotel hotel : hotels)
		{
			System.out.println(hotel.getId() + ": " + hotel.getName());
		}
	}

	private static void printHotel(Hotel hotel)
	{
		System.out.println(hotel.toString());
	}

	private static void printReviews(Review[] reviews)
	{
		for (Review review : reviews)
		{
			System.out.println(review.toString());
		}
	}

	// Created all functions below in lecture
	// API calls
	private static void getHotels()
	{
		// 1 - specify the URL (endpoint) of the API
		// ** important! must include http:// 
		// even though the browser hides it from us
		// uses the constant variable from above
		String url = BASE_URL + "hotels";
		
		// 2 - call the API
		// 3 - convert the data
		// gives me the ability to call my API
		// below means "whatever comes back, return as a String datatype"
		// uses the restTemplate variable declared above
		Hotel[] hotels = restTemplate.getForObject(url, Hotel[].class);
		
		// 4 - use the data
		// (this function was written out above)
		printHotels(hotels);
	}
	
	private static void getReviews()
	{
		String url = "http://localhost:3000/reviews";
		
		RestTemplate restTemplate = new RestTemplate();
		
		Review[] reviews = restTemplate.getForObject(url, Review[].class);
		
		printReviews(reviews);
	}
	
	private static void getHotelById(int id)
	{
		String url = BASE_URL + "hotels/" + id;
	
		Hotel hotel = restTemplate.getForObject(url, Hotel.class);

		printHotel(hotel);
	}

	private static void getReviewsByHotelId(int id)
	{
		String url = BASE_URL + "reviews?hotelID=" + id;
		
		Review[] reviews = restTemplate.getForObject(url, Review[].class);
		
		printReviews(reviews);
	}

	private static void getHotelsByRating(int rating)
	{
		String url = BASE_URL + "hotels?stars=" + rating;
	
		Hotel[] hotels = restTemplate.getForObject(url, Hotel[].class);

		printHotels(hotels);
	}
}
