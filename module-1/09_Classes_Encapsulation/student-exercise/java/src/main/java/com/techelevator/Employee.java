package com.techelevator;

public class Employee
{
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;

	// constructor
	public Employee(int newEmployeeId, String newFirstName, String newLastName, double newSalary)
	{
		employeeId = newEmployeeId;
		firstName = newFirstName;
		lastName = newLastName;
		annualSalary = newSalary;
	}

	// getters
	public int getEmployeeId()
	{
		return employeeId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getDepartment()
	{
		return department;
	}

	public double getAnnualSalary()
	{
		return annualSalary;
	}

	// derived property
	public String getFullName()
	{
		return lastName + ", " + firstName;
	}

	// setters
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}

	public void setDepartment(String newDepartment)
	{
		department = newDepartment;
	}

	// method
	public void raiseSalary(double percent)
	{
		if (percent > 0.00)
		{
			annualSalary = annualSalary * (1.0 + (percent / 100));
		}
	}

}
