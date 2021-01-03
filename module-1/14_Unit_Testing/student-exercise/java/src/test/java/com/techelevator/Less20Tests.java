package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests
{
	@Test
	public void isLessThanMultipleOf20_shouldReturnTrue_ifNIs18()
	{
		//arrange
		Less20 checkForMultiple = new Less20();
		int n = 18;
		
		//act
		boolean actual = checkForMultiple.isLessThanMultipleOf20(n);
		
		//assert
		Assert.assertTrue("n % 20 does not equal two less than multiple of 20", actual);
		
	}
	
	@Test
	public void isLessThanMultipleOf20_shouldReturnTrue_ifNIs19()
	{
		//arrange
		Less20 checkForMultiple = new Less20();
		int n = 19;
		
		//act
		boolean actual = checkForMultiple.isLessThanMultipleOf20(n);
		
		//assert
		Assert.assertTrue("n % 20 does not equal one less than multiple of 20", actual);
	}
	
	
	@Test
	public void isLessThanMultipleOf20_shouldReturnFalse_ifNIs20()
	{
		//arrange
		Less20 checkForMultiple = new Less20();
		int n = 20;
		
		//act
		boolean actual = checkForMultiple.isLessThanMultipleOf20(n);
		
		//assert
		Assert.assertFalse("n % 20 leaves no remainder", actual);
		
	}
	
	@Test
	public void isLessThanMultipleOf20_shouldReturnTrue_ifNIs39()
	{
		//arrange
		Less20 checkForMultiple = new Less20();
		int n = 39;
		
		//act
		boolean actual = checkForMultiple.isLessThanMultipleOf20(n);
		
		//assert
		Assert.assertTrue("n % 20 does not equal one less than multiple of 20", actual);
	}
	
	@Test
	public void isLessThanMultipleOf20_shouldReturnTrue_ifNIs38()
	{
		//arrange
		Less20 checkForMultiple = new Less20();
		int n = 38;
		
		//act
		boolean actual = checkForMultiple.isLessThanMultipleOf20(n);
		
		//assert
		Assert.assertTrue("n % 20 does not equal two less than multiple of 20", actual);
		
	}
	
	@Test
	public void isLessThanMultipleOf20_shouldReturnFalse_ifNIs40()
	{
		//arrange
		Less20 checkForMultiple = new Less20();
		int n = 40;
		
		//act
		boolean actual = checkForMultiple.isLessThanMultipleOf20(n);
		
		//assert
		Assert.assertFalse("n % 20 leaves no remainder", actual);
		
	}
	
	@Test 
	public void isLessThanMultipleOf20_shouldReturnFalse_ifNIsLessThan18()
	{
		//arrange
		Less20 checkForMultiple = new Less20();
		int n = 15;
		
		//act
		boolean actual = checkForMultiple.isLessThanMultipleOf20(n);
		
		//assert
		Assert.assertFalse("n % 20 leaves too high a remainder", actual);
	}
	
	@Test 
	public void isLessThanMultipleOf20_shouldReturnFalse_ifNIsGreaterThan20()
	{
		//arrange
		Less20 checkForMultiple = new Less20();
		int n = 15;
		
		//act
		boolean actual = checkForMultiple.isLessThanMultipleOf20(n);
		
		//assert
		Assert.assertFalse("n % 20 leaves too high a remainder", actual);
	}
	
}
