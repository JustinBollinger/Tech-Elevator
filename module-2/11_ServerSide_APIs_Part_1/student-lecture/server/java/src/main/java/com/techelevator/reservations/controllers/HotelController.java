package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController
{

	private HotelDAO hotelDAO;
	private ReservationDAO reservationDAO;

	public HotelController()
	{
		this.hotelDAO = new MemoryHotelDAO();
		this.reservationDAO = new MemoryReservationDAO(hotelDAO);
	}

	/**
	 * Return All Hotels
	 *
	 * @return a list of all hotels in the system
	 */
	
	// below is called an annotation
	// just a flag or way to mark the function to the program
	// this means that it will only respond to the GET function
	@RequestMapping(path = "/hotels", method = RequestMethod.GET)
	public List<Hotel> list()
	{
		return hotelDAO.list();
	}

	/**
	 * Return hotel information
	 *
	 * @param id the id of the hotel
	 * @return all info for a given hotel
	 */

	// {id} is what's called a path variable
	// means whatever is inside of there 
	// needs to be what our variable needs to be in our functions
	@RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
	public Hotel get(@PathVariable int id)
	{
		return hotelDAO.get(id);
	}

}
