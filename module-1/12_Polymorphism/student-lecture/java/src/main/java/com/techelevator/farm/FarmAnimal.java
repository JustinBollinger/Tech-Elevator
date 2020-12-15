package com.techelevator.farm;

public class FarmAnimal {
	private String name;
	private String sound;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
//	// overloading the constructor
//	// allows the user to create a FarmAnimal in 2 different ways
//	public FarmAnimal()
//	{
//		// call a different constructor
//		// with a different signature...
//		this("Cow", "moo!");
//		
//		//... so that I don't repeat myself.
//		// below code is not very DRY
////		this.name = "Cow";
////		this.sound = "moo!";
//	}

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

}