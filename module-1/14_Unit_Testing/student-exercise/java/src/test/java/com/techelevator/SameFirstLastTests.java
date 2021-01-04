package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests
{
	@Test
	public void isItTheSame_shouldReturnFalse_ifFirstAndLastElementAreNotEqual()
	{
		//arrange
		SameFirstLast compareFirstAndLast = new SameFirstLast();
		int[] nums = {1, 2, 3};
		boolean expected = false;
		
		//act
		boolean actual = compareFirstAndLast.isItTheSame(nums);
		
		//assert
		Assert.assertFalse("first and last element should not be equal", actual);
	}
	
	@Test
	public void isItTheSame_shouldReturnTrue_ifFirstAndLastElementAreEqual_fourNumberArray()
	{
		//arrange
		SameFirstLast compareFirstAndLast = new SameFirstLast();
		int[] nums = {1, 2, 3, 1};
		boolean expected = true;
		
		//act
		boolean actual = compareFirstAndLast.isItTheSame(nums);
		
		//assert
		Assert.assertTrue("first and last element should be equal", actual);
	}
	
	@Test
	public void isItTheSame_shouldReturnTrue_ifFirstAndLastElementAreEqual_threeNumberArray()
	{
		//arrange
		SameFirstLast compareFirstAndLast = new SameFirstLast();
		int[] nums = {1, 2, 1};
		boolean expected = true;
		
		//act
		boolean actual = compareFirstAndLast.isItTheSame(nums);
		
		//assert
		Assert.assertTrue("first and last element should be equal", actual);
	}
	
	@Test
	public void isItTheSame_shouldReturnFalse_ifNumsIsNull()
	{
		//arrange
		SameFirstLast compareFirstAndLast = new SameFirstLast();
		int[] nums = null;
		boolean expected = false;
		
		//act
		boolean actual = compareFirstAndLast.isItTheSame(nums);
		
		
		//assert
		Assert.assertFalse("nums should be null and return false", actual);
	}
	
	@Test
	public void isItTheSame_shouldReturnTrue_ifNumsLengthIs1()
	{
		//arrange
		SameFirstLast compareFirstAndLast = new SameFirstLast();
		int[] nums = {1};
		boolean expected = true;
		
		//act
		boolean actual = compareFirstAndLast.isItTheSame(nums);
		
		//assert
		Assert.assertTrue("nums should have one element and return true", actual);
		
		
		
		
	}
	
}
