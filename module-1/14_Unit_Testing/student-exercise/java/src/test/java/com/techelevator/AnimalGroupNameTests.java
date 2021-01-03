package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests
{

	@Test
	public void getHerd_shouldReturnCrash_whenRhinoIsPassed()
	{
		//arrange
		AnimalGroupName herdName = new AnimalGroupName();
		String animalName = "Rhino";
		String expected = "Crash";
		
		//act
		String actual = herdName.getHerd(animalName);
		
		
		//assert
		Assert.assertEquals("Key Value pair do not match pair in animals Map ", expected, actual);
	}
	
	
	
	@Test
	public void getHerd_shouldReturnCrash_whenRhinoAllLowerCaseIsPassed()
	{
		//arrange
		AnimalGroupName herdName = new AnimalGroupName();
		String animalName = "rhino";
		String expected = "Crash";
		
		//act
		String actual = herdName.getHerd(animalName);
		
		
		//assert
		Assert.assertSame("Key Value pair do not match pair in animals Map ", expected, actual);
		
	}
	
	@Test
	public void getHerd_shouldReturnUnknown_whenAnimalNameDIsNotFound()
	{
		//arrange
		AnimalGroupName herdName = new AnimalGroupName();
		String animalName = "walrus";
		String expected = "unknown";
		
		//act
		String actual = herdName.getHerd(animalName);
		
		
		//assert
		Assert.assertEquals("animalName key does not exist within animals Map ", expected, actual);
		
	}
	
	@Test
	public void getHerd_shouldReturnUnknown_whenAnimalNameIsAnEmptyString()
	{
		//arrange
		AnimalGroupName herdName = new AnimalGroupName();
		String animalName = "";
		String expected = "unknown";
		
		//act
		String actual = herdName.getHerd(animalName);
		
		//assert
		Assert.assertEquals("animalName is an empty String", expected, actual);
	}
	
	
	@Test
	public void getHerd_shouldReturnUnknown_whenAnimalNameIsNull()
	{
		//arrange
		AnimalGroupName herdName = new AnimalGroupName();
		String animalName = null;
		String expected = "unknown";
		
		//act
		String actual = herdName.getHerd(animalName);
		
		//assert
		Assert.assertEquals("animalName is null ", expected, actual);

	}
	
	@Test
	public void getHerd_shouldReturnTower_whenAnimalNameIsLowerCaseGiraffe()
	{
		//arrange
		AnimalGroupName herdName = new AnimalGroupName();
		String animalName = "giraffe";
		String expected = "Tower";
		
		//act
		String actual = herdName.getHerd(animalName);
		
		//assert
		Assert.assertEquals("Key Value pair do not match pair in animals Map", expected, actual);
	
	}
}
