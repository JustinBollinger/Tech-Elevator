package com.techelevator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static void main is necessary to run the application
		// where all code starts

			int counter = 0;
			
			// line below was "if" but by changing
			// it to "while", it changes to a loop
			while(counter < 5)
			{
				System.out.println(counter);
				
			// all three lines below mean the same thing
//				counter = counter + 1;
//				counter += 1;
				counter++;
			}
			// the three counts below must be in that order.
			// they are positional
			// format below is NON STANDARD
			// typically ordered all on the same line
			for(int count = 0;
					count < 5;
					count = count + 2)
			{
				System.out.println(count);
			}
	
			System.out.println("end of program");
	
	}

}
