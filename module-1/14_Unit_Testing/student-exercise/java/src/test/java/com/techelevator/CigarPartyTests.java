package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class CigarPartyTests
{
	@Test
	public void haveParty_shouldReturnFalse_whenFewerThan40CigarsOnWeekday()
	{
		// arrange
		CigarParty party = new CigarParty(); // object under test
		int numberOfCigars = 30;
		boolean isWeekend = false;
		
		
		
		// act
		// call the function of the object under test
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		// assert
		Assert.assertFalse("Because parties with < 40 cigars suck ", actual);

	}
	
	@Test
	public void haveParty_shouldReturnTrue_when50CigarsOnWeekday()
	{
		// arrange
		CigarParty party = new CigarParty();
		int numberOfCigars = 50;
		boolean isWeekend = true;
		
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		
		// assert
		Assert.assertTrue("Because the number of cigars is > 39 and < 61 ", actual);
	
	}
	
	@Test
	public void haveParty_shouldReturnTrue_when40CigarsOnWeekday()
	{
		// arrange
		CigarParty party = new CigarParty();
		int numberOfCigars = 40;
		boolean isWeekend = false;
		
		//act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		//assert
		Assert.assertTrue("Because the minimum amount of cigars required for a party on a weekday is 40 ", actual);
		
	}
	
	@Test
	public void haveParty_shouldReturnTrue_when40CigarsOnWeekend()
	{
		// arrange
		CigarParty party = new CigarParty();
		int numberOfCigars = 40;
		boolean isWeekend = true;
		
		//act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		//assert
		Assert.assertTrue("Because the minimum amount of cigars required for a party on the weekend is 40 ", actual);
		
	}
	
	@Test
	public void haveParty_shouldReturnFalse_whenMoreThan60CigarsOnWeekday()
	{
		// arrange
		CigarParty party = new CigarParty();
		int numberOfCigars = 61;
		boolean isWeekend = false;
		
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
				
				
				
		// assert
		Assert.assertFalse("Because the max number of cigars for a party on a weekday is 60 ", actual);
		
	}

	@Test
	public void haveParty_shouldReturnTrue_whenMoreThan60CigarsOnWeekend()
	{
		// arrange
		CigarParty party = new CigarParty();
		int numberOfCigars = 70;
		boolean isWeekend = true;
		
		
		// act
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		
		// assert
		Assert.assertTrue("Because there is no maximum limit of cigars on the weekend ", actual);
	
	}
	
	
}
