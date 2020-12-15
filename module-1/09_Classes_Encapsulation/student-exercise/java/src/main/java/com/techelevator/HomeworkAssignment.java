package com.techelevator;

public class HomeworkAssignment
{
	// what does it know?
	// instance variables go here
	// these variables belong to this class.
	// anything it knows should ALWAYS be private
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	

	
	// getters return the values
	// stored in private variables
	public int getEarnedMarks()
	{
		return earnedMarks;
	}
	
	public int getPossibleMarks()
	{
		return possibleMarks;
	}
	
	public String getSubmitterName()
	{
		return submitterName;
	}
	
	// derived property
	public String getLetterGrade()
	{
		double percentage = earnedMarks / (double)possibleMarks;
		
		if (percentage >= .9)
		{
			return "A";
		}
		 if (percentage >= .8)
		{
			return "B";
		}
		 if (percentage >= .7)
		{
			return "C";
		}
		 if (percentage >= .6)
		{
			return "D";
		}
		 else
		{
			 return "F";
		}
	}
	
	// setters change/set the value
	// of the private variables
	public void setEarnedMarks(int newEarnedMarks)
	{
		earnedMarks = newEarnedMarks;
	}	
	
	// constructor
	// MUST match name of Class
	public HomeworkAssignment(int newPossibleMarks, String newSubmitterName)
	{
		possibleMarks = newPossibleMarks;
		submitterName = newSubmitterName;
	}
	
}
