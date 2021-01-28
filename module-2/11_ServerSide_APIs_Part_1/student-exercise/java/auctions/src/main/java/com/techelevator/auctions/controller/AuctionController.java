package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController
{
	private AuctionDAO dao;

	public AuctionController()
	{
		this.dao = new MemoryAuctionDAO();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Auction> list()
	{
		return dao.list();
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Auction get(@PathVariable int id)
	{
		return dao.get(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Auction create(@RequestBody Auction auction)
	{
		return dao.create(auction);
	}
	
	// ** W H A T **
	// @RequestParam looks in the queryString
	@RequestMapping(path = "/getbytitle", method = RequestMethod.GET)
	public List<Auction> list(@RequestParam(value = "searchTerm", defaultValue = "") String title_like)
	{
		return dao.searchByTitle(title_like);
	}
	
//
//	public List<Auction> searchByPrice(double currentBid_lte)
//	{
//		
//	}
//
//	public List<Auction> searchByTitleAndPrice(String title, double currentBid)
//	{
//		
//	}

}
