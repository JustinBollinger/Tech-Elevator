package com.techelevator;

public class Employee
{
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	
	
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
		String fullName = firstName + lastName;
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
	
	public Employee(int employeeId, String firstName, String lastName, double salary)
	{
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
	}
	
	// logic is wrong
	public void raiseSalary(double percent)
	{
		percent = 5.5;
		double raise;
		raise = getAnnualSalary() * percent;
	}
	
	
}
