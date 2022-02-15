package com.qa.week2;

import java.util.Scanner;

public class OperatorSelection {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// ask which method to use
		System.out.println("Which method do you require (add (+), subtract (-), multiply (*), divide (/) )?: ");
		String methodChoice = scan.next();

		Boolean running = true;

		//do {
			if (methodChoice.equals("+")) {
				System.out.println("You've chosen addition");
			} else if (methodChoice.equals("-")) {
				System.out.println("You've chosen subtraction");
			} else if (methodChoice.equals("*")) {
				System.out.println("You've chosen multiplication");
			} else if (methodChoice.equals("/")) {
				System.out.println("You've chosen division");
			} else if (methodChoice.equals(" ")) {
				System.out.println("I don't know what you mean. Please try again");
			} else if (methodChoice.equals("Exit")) {
				System.out.println("Thank you, bye!");
				running = false;
			}

		}// while (running = true);
	}
}
