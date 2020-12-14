package com.techelevator;

public class Television
{
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	public boolean isOn()
	{
		return this.isOn;
	}
	
	
	public void channelUp()
	{
		if(this.isOn)
		{
			if(this.currentChannel < 18)
			{
				this.currentChannel++;
			}
			else 
			{
				this.currentChannel = 3;	// 3 because the requirements say to deal with channels between 3-18.
			}
		}
	}
	
	public void changeChannel(int currentChannel)
	{
		this.currentChannel = currentChannel;
	}
	
}
