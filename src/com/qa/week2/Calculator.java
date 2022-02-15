package com.qa.week2;
//Still broken. Needs more work to get the loop to work correctly.
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		String run = "Y";
		
		
	System.out.println("Do you want to run the calculator? Y/N? ");
	String runAgain = scan.next();	
		
	if (runAgain == "Y") {
			// allow input of first number
			System.out.println("Please enter a number: ");
			int userInput1 = scan.nextInt();

			// allow input of a second number
			System.out.println("Please enter another number: ");
			int userInput2 = scan.nextInt();

			// variables and function for each method choice
			int addition = userInput1 + userInput2;
			int subtraction = userInput1 - userInput2;
			int multiply = userInput1 * userInput2;
			double divide = (double) userInput1 / (double) userInput2;
		
			//choose which method to use
			System.out.println("Which method do you require (add (+), subtract (-), multiply (*), divide (/), Exit (to end the program )?: ");
			String methodChoice = scan.next();

		
				//if statements for each method case
				if (methodChoice.equals("Exit")) {
						System.out.println("Thank you, goodbye!");
							return;
					} else if (methodChoice.equals("add") || (methodChoice.equals("+"))) {
						System.out.println("You've chosen addition");
						System.out.println(userInput1 + "+" + userInput2 + " is: " + addition);
			
					} else if (methodChoice.equals("subtract") || (methodChoice.equals("-"))) {
						System.out.println("You've chosen subtraction");
						System.out.println(userInput1 + "-" + userInput2 + " is: " + subtraction);
			
					} else if (methodChoice.equals("multiply") || (methodChoice.equals("*"))) {
						System.out.println("You've chosen multiplication");
						System.out.println(userInput1 + "*" + userInput2 + " is: " + multiply);
			
					} else if (methodChoice.equals("divide") || (methodChoice.equals("/"))) {
						System.out.println("You've chosen division");
						System.out.println(userInput1 + "/" + userInput2 + " is: " + divide);
			
					} else {
						System.out.println("I'm sorry, I don't know what you mean. \nPlease try again");
					}	
	} else {
		break;
	}
	} while (run.equals("Y"));
}
}