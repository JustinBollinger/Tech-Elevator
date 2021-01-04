package com.techelevator;

public class Television
{	
	//instance variables
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;

	//no constructor necessary
	
	//methods
	public void turnOff()
	{
		isOn = false;
	}
	
	public void turnOn()
	{
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	
	public void changeChannel(int newChannel)
	{
		if (isOn)
		{
			if (newChannel > 2 && newChannel < 19)
				currentChannel = newChannel;
		}
	}
	
	public void channelUp()
	{
		if (this.isOn)
		{
			if (this.currentChannel < 18)
			{
				this.currentChannel++;
			}
			else
			{
				this.currentChannel = 3;
			}
		}
	}
	
	public void channelDown()
	{
		if (this.isOn)
		{
			if (this.currentChannel > 3)
			{
				this.currentChannel--;
			}
			else
			{
				this.currentChannel = 18;
			}
		}
	}
	
	public void raiseVolume()
	{
		if (this.isOn)
		{
			if (currentVolume < 10)
			{
				currentVolume++;
			}
		}
	}
	
	public void lowerVolume()
	{
		if (this.isOn)
		{
			if (currentVolume > 0)
			{
				currentVolume--;
			}
		}
	}

	
	//getters
	public boolean isOn()
	{
		return this.isOn;
	}
	
	public int getCurrentChannel()
	{
		return currentChannel;
	}
	
	public int getCurrentVolume()
	{
		return currentVolume;
	}
	
	
}
