package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests
{
	@Test
	public void getBits_shouldReturnAString_ofEveryOtherChar_whenPassingHello()
	{
		//arrange
		StringBits everyOtherChar = new StringBits();
		String str = "Hello";
		String expected = "Hlo";
		
		//act
		String actual = everyOtherChar.getBits(str);
		
		//assert
		Assert.assertEquals("getBits should be removing every other char starting with the first", expected, actual);
	}
	
	@Test
	public void getBits_shouldReturnAString_ofEveryOtherChar_whenPassingHi()
	{
		//arrange
		StringBits everyOtherChar = new StringBits();
		String str = "Hi";
		String expected = "H";
		
		//act
		String actual = everyOtherChar.getBits(str);
		
		//assert
		Assert.assertEquals("getBits should be removing every other char starting with the first", expected, actual);
	}
	
	@Test
	public void getBits_shouldReturnAString_ofEveryOtherChar_whenPassingHeeololeo()
	{
		//arrange
		StringBits everyOtherChar = new StringBits();
		String str = "Heeololeo";
		String expected = "Hello";
		
		//act
		String actual = everyOtherChar.getBits(str);
		
		//assert
		Assert.assertEquals("getBits should be removing every other char starting with the first", expected, actual);
	}
	
	@Test
	public void getBits_shouldReturnNull_whenStrIsNull()
	{
		//arrange
		StringBits everyOtherChar = new StringBits();
		String str = null;
		String expected = null;
		
		//act
		String actual = everyOtherChar.getBits(str);
		
		
		//assert
		Assert.assertNull("getBits should return null", null);
	}
	
}
