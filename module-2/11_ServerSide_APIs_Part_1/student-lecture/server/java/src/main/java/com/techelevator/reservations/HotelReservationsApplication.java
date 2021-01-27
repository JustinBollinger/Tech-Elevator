package com.techelevator.reservations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelReservationsApplication
{

	public static void main(String[] args)
	{
		// all this does is launches a web server
		// the starting point of our application
		SpringApplication.run(HotelReservationsApplication.class, args);
	}

}
