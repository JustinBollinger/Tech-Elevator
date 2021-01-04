package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests
{
	@Test
	public void getPartialString_shouldReturn_ellohere_whenHelloAndThereArePassed()
	{
		//arrange
		NonStart concatAndOmit = new NonStart();
		String a = "Hello";
		String b = "There";
		String expected = "ellohere";
		
		//act
		String actual = concatAndOmit.getPartialString(a, b);
		
		//assert
		Assert.assertEquals("Both words should have their first char omitted and must be concatenated", expected, actual);	
	}
	
	@Test
	public void getPartialString_shouldReturn_avaode_when_java_and_code_arePassed()
	{
		//arrange
		NonStart concatAndOmit = new NonStart();
		String a = "java";
		String b = "code";
		String expected = "avaode";
		
		//act
		String actual = concatAndOmit.getPartialString(a, b);
		
		//assert
		Assert.assertEquals("Both words should have their first char omitted and must be concatenated", expected, actual);
	}
	
	@Test
	public void getPartialString_shouldReturn_hotlava_when_shotl_and_java_arePassed()
	{
		//arrange
		NonStart concatAndOmit = new NonStart();
		String a = "shotl";
		String b = "java";
		String expected = "hotlava";
		
		//act
		String actual = concatAndOmit.getPartialString(a, b);
		
		//assert
		Assert.assertEquals("Both words should have their first char omitted and must be concatenated", expected, actual);
	}
	
	@Test
	public void getPartialString_shouldReturn_here_ifALengthIs0()
	{
		// arrange
		NonStart concatAndOmit = new NonStart();
		String a = "";
		String b = "There";
		String expected = "here";
		
		//act
		String actual = concatAndOmit.getPartialString(a, b);
		
		//assert
		Assert.assertEquals("Only b should return a substring omitting the first char", expected, actual);
		
	}
	
	@Test
	public void getPartialString_shouldReturn_ello_ifBLengthIs0()
	{
		// arrange
		NonStart concatAndOmit = new NonStart();
		String a = "Hello";
		String b = "";
		String expected = "ello";
		
		//act
		String actual = concatAndOmit.getPartialString(a, b);	
				
		//assert
		Assert.assertEquals("Only a should return a substring omitting the first char", expected, actual);
		
	}
	
	@Test
	public void getPartialString_shouldReturn_ode_ifALengthIs0()
	{
		// arrange
		NonStart concatAndOmit = new NonStart();
		String a = "";
		String b = "code";
		String expected = "ode";
		
		//act
		String actual = concatAndOmit.getPartialString(a, b);		
				
		//assert
		Assert.assertEquals("Only b should return a substring omitting the first char", expected, actual);
		
	}
	
	@Test
	public void getPartialString_shouldReturn_ava_ifBLengthIs0()
	{
		
		// arrange
		NonStart concatAndOmit = new NonStart();
		String a = "java";
		String b = "";
		String expected = "ava";
		
		//act
		String actual = concatAndOmit.getPartialString(a, b);	
				
		//assert
		Assert.assertEquals("Only a should return a substring omitting the first char", expected, actual);
	}
	
	@Test
	public void getPartialString_shouldReturn_ava_ifALengthIs0()
	{
		// arrange
		NonStart concatAndOmit = new NonStart();
		String a = "";
		String b = "java";
		String expected = "ava";
		
		//act
		String actual = concatAndOmit.getPartialString(a, b);	
				
		//assert
		Assert.assertEquals("Only b should return a substring omitting the first char", expected, actual);
		
	}
	
	@Test
	public void getPartialString_shouldReturn_hotl_ifBLengthIs0()
	{
		// arrange
		NonStart concatAndOmit = new NonStart();
		String a = "shotl";
		String b = "";
		String expected = "hotl";
		
		//act
		String actual = concatAndOmit.getPartialString(a, b);	
				
		//assert
		Assert.assertEquals("Only a should return a substring omitting the first char", expected, actual);
		
	}
	
	
}
