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

//	@RequestMapping(path = "/title_like", method = RequestMethod.GET)
//	public List<Auction> list(@RequestParam(value = "title_like", defaultValue = "") String title_like)
//	{
//		List<Auction> auctions
//		if ( != null)
//		{
//			return dao.searchByTitle(title_like);
//		}
//		else
//		{
//		return dao.list();
//		}
//	}
	
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
