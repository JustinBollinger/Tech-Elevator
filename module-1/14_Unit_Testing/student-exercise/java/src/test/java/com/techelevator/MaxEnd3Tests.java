package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests
{
	@Test
	public void makeArray_shouldReturn3Threes_whenOne_Two_AndThreeArePassed()
	{
		//arrange
		MaxEnd3 maxNumber = new MaxEnd3();
		int[] nums = {1, 2, 3};
		int[] expecteds = {3, 3, 3};
		
		//act
		int[] actuals = maxNumber.makeArray(nums);
		
		//assert
		Assert.assertArrayEquals("3 is the largest of the first and last array elements and should repeat three times", expecteds, actuals);
	}
	
	@Test
	public void makeArray_shouldReturn3Elevens_whenFive_Nine_AndElevenArePassed()
	{
		//arrange
		MaxEnd3 maxNumber = new MaxEnd3();
		int[] nums = {11, 5, 9};
		int[] expecteds = {11, 11, 11};
		
		//act
		int[] actuals = maxNumber.makeArray(nums);
		
		//assert
		Assert.assertArrayEquals("11 is the largest of the first and last array elements and should repeat three times", expecteds, actuals);
	}
	
	@Test
	public void makeArray_shouldReturn3Threes_whenTwo_Eleven_andThreeArePassed()
	{
		//arrange
		MaxEnd3 maxNumber = new MaxEnd3();
		int[] nums = {2, 11, 3};
		int[] expecteds = {3, 3, 3};
		
		//act
		int[] actuals = maxNumber.makeArray(nums);
		
		//assert
		Assert.assertArrayEquals("3 is the largest of the first and last array elements and should repeat three times", expecteds, actuals);
	}
	
	
	
}
