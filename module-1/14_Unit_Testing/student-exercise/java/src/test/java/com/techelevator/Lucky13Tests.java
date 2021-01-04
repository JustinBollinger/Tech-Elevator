package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests
{
	@Test
	public void getLucky_shouldReturnTrue_ifTheArrayContainsNoOnesAndThrees()
	{
		//arrange
		Lucky13 checkForOnesAndThrees = new Lucky13();
		int[] nums = {0, 2, 4};
		boolean expected = true;
		
		//act
		boolean actual = checkForOnesAndThrees.getLucky(nums);
		
		//assert
		Assert.assertEquals("nums should not contain any 1's and 3's", expected, actual);
		
	}

	@Test
	public void getLucky_shouldReturnFalse_ifTheArrayContainsBothAOneAndAThree()
	{
		//arrange
		Lucky13 checkForOnesAndThrees = new Lucky13();
		int[] nums = {1, 2, 3};
		boolean expected = false;
		
		//act
		boolean actual = checkForOnesAndThrees.getLucky(nums);
		
		//assert
		Assert.assertEquals("nums contains no 1's or 3's", expected, actual);

	}
	
	@Test
	public void getLucky_shouldReturnFalse_ifTheArrayContainsAOneAndNoThrees()
	{
		//arrange
		Lucky13 checkForOnesAndThrees = new Lucky13();
		int[] nums = {1, 2, 4};
		boolean expected = false;
		
		//act
		boolean actual = checkForOnesAndThrees.getLucky(nums);
		
		//assert
		Assert.assertEquals("nums contains no 1's", expected, actual);	
	}
	
	@Test
	public void getLucky_shouldReturnFalse_ifTheArrayContainsAThreeAndNoOnes()
	{
		//arrange
		Lucky13 checkForOnesAndThrees = new Lucky13();
		int[] nums = {0, 2, 3};
		boolean expected = false;
		
		//act
		boolean actual = checkForOnesAndThrees.getLucky(nums);
		
		//assert
		Assert.assertEquals("nums contains no 3's", expected, actual);
	}
}
