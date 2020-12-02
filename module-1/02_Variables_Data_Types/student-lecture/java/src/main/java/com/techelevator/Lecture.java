package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		// how to declare a variable
		// datatype variableName;
		// use camelCase convention for variable names
		
		int numberOfExercises;
		numberOfExercises = 26;
		System.out.println("1. numberOfExercises = " + numberOfExercises);

		
		
		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		
		double half = 0.5;
		System.out.println("2. half = " + half);

		
		
		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		
		String name = "TechElevator";
		System.out.println("3. name = " + name);

		
		
		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		
		byte seasonsOfFirefly = 1;	
		System.out.println("4. seasonsOfFirefly = " + seasonsOfFirefly);

		
		
		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		
		String myFavoriteLanguage = "Java";
		System.out.println("5. myFavoriteLanguage = " + myFavoriteLanguage);

		
		
		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		
		double pi = 3.1416;		
		System.out.println("6. pi = " + pi);

		
		
		/*
		7. Create and set a variable that holds your name.
		*/
		
		String myName = "Justin Bollinger";
		System.out.println("7. myName = " + myName);
		
		
		
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		
		int numberOfButtonsOnMouse = 2;
		System.out.println("8. numberOfButtonsOnMouse = " + numberOfButtonsOnMouse);
		
		
		
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		
		double percentBattery;
		percentBattery = .43;
		System.out.println("9. percentBattery = " + percentBattery);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/

		double firstNumber11 = 12.3;
		double secondNumber11 = 32.1;
		double answerNumber11 = firstNumber11 + secondNumber11;
		System.out.println();
		
		
		
		/*
		12. Create a String that holds your full name.
		*/
		
		String fullName = "Justin Bollinger";
		System.out.println("12. fullName = " + fullName);
		
		
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/

		String helloFullName = "Hello " + fullName;
		System.out.println("13. helloFullName = " + helloFullName);
		
		
		
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

		// fullName -> Justin Bollinger Esquire
		fullName = fullName + " Esquire";
		System.out.println();
		
		
		
		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		
		fullName += " Esquire";
		
		
		
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/

		/*
		18. What is 4.4 divided by 2.2?
		*/

		double numerator = 4.4;
		double denominator = 2.2;
		double answer = numerator / denominator;
		System.out.println("18. 4.4 / 2.2 = " + answer);
		
		
		
		/*
		19. What is 5.4 divided by 2?
		*/
		
		double numerator2 = 5.4;
		int denominator2 = 2;
		double answer2 = numerator2 / denominator2;
		System.out.println("19. 5.4 / 2 = " + answer2);
		
		
		
		/*
		20. What is 5 divided by 2?
		*/

		/*
		21. What is 5.0 divided by 2?
		*/

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		
		// below is taking question 23 further by adding division into the equation.
		
		int one23 = 19;
		int two23 = 4;
		int division = one23 / two23;
		int remainder = one23 % two23;
		System.out.println("23. " + division + " r " + remainder);
		
		
		
		/*
		24. What is 1,000,000,000 * 3?
		*/

		// below is integer math. one of the numbers must be a long in order to do long math. int * int = int, which can't store over 2 billion and some change. Add an l to 3
		int billion = 1000000000;
		long threeBillion = billion * 3l;
		System.out.println("24. Three Billion = " + threeBillion);
		
		
		
		
		
		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/

		boolean doneWithExercises = false;
		
		
		/*
		26. Now set doneWithExercise to true.
		*/
		
		//the ! character means NOT, so it toggles the value of what it precedes.
		doneWithExercises = !doneWithExercises;
		
		doneWithExercises = true;
		
		
		
	}

}
