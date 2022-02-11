package com.qa.week1;

public class Day1 {

	public static void main(String[] args) {
		// Instruction (method) within the main method. Directly prints to console. 
		//Doesn't save the information. Can't be called to be used elsewhere. Not very useful.
		System.out.println("Hello World!");
		
		
		//Instructions (method) within the main method. Two steps.
		//step 1 - define the variable (as message2)
		//step 2 - call the variable to print it to the console.
		//Variable can be used multiple times in multiple methods. Useful to/must state variables at the beginning of each new method 
		String message2 = "Hello World 2!";
		System.out.println(message2);
		
		printMessage(); //This is calling the method that was created below, outside the main method.
						//The variable is set within the method so nothing needs to be added here.
		
		
		printAnotherMessage("Hello World 4!"); //This is calling the method created below, and telling it that the parameter 
											   //(the temporary variable) should be "Hello World 4!". The method can then use the 
											   //given parameter in the next step - to print it out.
		
		
		} //This marks the end of the main method
	
	
	//This is the start of a new method outside the main method. 
	//Because this is outside the main method it will not run until it is called from within the main method.
	public static void printMessage() { 		//Here we name the method "printMessage"
		String message3 = "Hello World 3!"; 	//Here we set the variable "message3" as the phrase "Hello World 3!"
		System.out.println(message3); 			//Here we tell the method to print out whatever is saved in the variable "message3".
	}
	
	
	//This is another way to write a method outside the main method.
	//The PARAMETER in the brackets is telling the method that when it is called, the parameter is the temporary variable it should use.
	//When this method "printAnotherMessage" is called from the main method it will create the temporary variable "message4". 
	//However, we need to tell "printAnotherMethod" what to put in the variable "message4" at the point 
	//that we are calling it in the main method. 
	public static void printAnotherMessage(String message4) {
		System.out.println(message4);
	}
}
