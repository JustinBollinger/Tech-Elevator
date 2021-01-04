package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTests
{
	@Test
	public void getCount_shouldReturnEachString_inAnArray_alongWithHowManyTimesItAppearsInTheArray_baBaBlackSheep()
	{
		// Arrange
		WordCount dictionaryEntry = new WordCount();
		Map<String, Integer> words = new HashMap<>();
		String[] str = { "ba", "ba", "black", "sheep" };
		Map<String, Integer> expected = new HashMap<String, Integer>()
		{
			{
				put("ba", 2);
				put("black", 1);
				put("sheep", 1);
			}
		};
		
		
		// Act
		Map<String, Integer> actual = dictionaryEntry.getCount(str);
		
		
		// Assert
		Assert.assertEquals("New dictionary<string, int> will be ", expected, actual);

	}

	@Test
	public void getCount_shouldReturnEachString_inAnArray_alongWithHowManyTimesItAppearsInTheArray_aBACB()
	{
		// Arrange
		WordCount dictionaryEntry = new WordCount();
		Map<String, Integer> words = new HashMap<>();
		String[] str = { "a", "b", "a", "c", "b" };
		Map<String, Integer> expected = new HashMap<String, Integer>()
		{
			{
				put("a", 2);
				put("b", 2);
				put("c", 1);
			}
		};

		// Act
		Map<String, Integer> actual = dictionaryEntry.getCount(str);

		// Assert
		Assert.assertEquals("New dictionary<string, int> will be ", expected, actual);
	}

	@Test
	public void getCount_shouldReturnEachString_inAnArray_alongWithHowManyTimesItAppearsInTheArray_cBA()
	{
		// Arrange
		WordCount dictionaryEntry = new WordCount();
		Map<String, Integer> words = new HashMap<>();
		String[] str = { "c", "b", "a" };
		Map<String, Integer> expected = new HashMap<String, Integer>()
		{
			{
				put("c", 1);
				put("b", 1);
				put("a", 1);
			}
		};

		// Act
		Map<String, Integer> actual = dictionaryEntry.getCount(str);

		// Assert
		Assert.assertEquals("New dictionary<string, int> will be ", expected, actual);
	}
}
