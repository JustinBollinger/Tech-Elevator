package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests
{
	@Test
	public void getATable_shouldReturn2_whenOnePersonIsVeryStylish()
	{
		//arrange
		DateFashion table = new DateFashion();
		int you = 5;
		int date = 10;
		int expected = 2;
		
		//act
		int actual = table.getATable(you, date);
		
		//assert
		Assert.assertEquals("Stylishness value is below required threshold ", expected, actual);

	}
	
	@Test
	public void getATable_shouldReturn1_whenBothPeopleAreMildlyStylish()
	{
		//arrange
		DateFashion table = new DateFashion();
		int you = 7;
		int date = 5;
		int expected = 1;
		
		//act
		int actual = table.getATable(you, date);
		
		//assert
		Assert.assertEquals("Stylishness value is either above or below expected threshold ", expected, actual);
		
	}
	
	@Test
	public void getATable_shouldReturn0_whenOnePersonIsNotStylish()
	{
		//arrange
		DateFashion table = new DateFashion();
		int you = 5;
		int date = 2;
		int expected = 0;
		
		//act
		int actual = table.getATable(you, date);
		
		//assert
		Assert.assertEquals("Stylishness value is above expected threshold ", expected, actual);
		
	}
	
	@Test
	public void getATable_shouldReturn0_whenOnePersonIsNotStylishAndTheOtherIsVeryStylish()
	
	{
		//arrange
		DateFashion table = new DateFashion();
		int you = 9;
		int date = 2;
		int expected = 0;
		
		//act
		int actual = table.getATable(you, date);
		
		//assert
		Assert.assertEquals("One stylishness value is above expected threshold ", expected, actual);
	}
	
	@Test 
	public void getATable_shouldReturn2_whenBothPeopleAreVeryStylish()
	{
		//arrange
		DateFashion table = new DateFashion();
		int you = 9;
		int date = 10;
		int expected = 2;
		
		//act
		int actual = table.getATable(you, date);
		
		//assert
		Assert.assertEquals("Both stylishness values are below expected threshold ", expected, actual);
		
		
	}
	
	@Test
	public void getATable_shouldReturn0_whenBothPeopleAreNotStylish()
	{
		//arrange
		DateFashion table = new DateFashion();
		int you = 1;
		int date = 2;
		int expected = 0;
		
		
		//act
		int actual = table.getATable(you, date);
		
		
		//assert
		Assert.assertEquals("Both stylishness values are above expected threshold ", expected, actual);
		
		
		
	}
}
