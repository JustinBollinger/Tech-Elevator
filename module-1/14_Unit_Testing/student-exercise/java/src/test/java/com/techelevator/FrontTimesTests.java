package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests
{
	@Test
	public void generateString_shouldReturn2Copies_ofTheFirst3CharactersOfTheString()
	{
		//arrange
		FrontTimes repeatString = new FrontTimes();
		String str = "Chocolate";
		int n = 2;
		String expected = "ChoCho";
		
		//act
		String actual = repeatString.generateString(str, n);
		
		//assert
		Assert.assertEquals("result should be repeated twice ", expected, actual);
		
	}
	
	@Test
	public void generateString_shouldReturn3Copies_ofTheFirst3CharactersOfTheString()
	{
		//arrange
		FrontTimes repeatString = new FrontTimes();
		String str = "Chocolate";
		int n = 3;
		String expected = "ChoChoCho";
		
		//act
		String actual = repeatString.generateString(str, n);
		
		//assert
		Assert.assertEquals("result should be repeated thrice ", expected, actual);
	}
	
	@Test
	public void generateString_shouldReturn3Copies_ofTheEntireString()
	{
		//arrange
		FrontTimes repeatString = new FrontTimes();
		String str = "Abc";
		int n = 3;
		String expected = "AbcAbcAbc";
		
		//act
		String actual = repeatString.generateString(str, n);
		
		//assert
		Assert.assertEquals("result should repeat the whole str thrice ", expected, actual);
	}
	
	@Test
	public void generateString_shouldThrowNullException_whenStringIsNull()
	{
		//arrange
		FrontTimes repeatString = new FrontTimes();
		String str = null;
		int n = 3;
		String expected = null;
		
		//act
		String actual = repeatString.generateString(str, n);
		
		//assert
		Assert.assertNull("str is null", null);
		
		
	}
	
	
	
	
	
	
	
}
