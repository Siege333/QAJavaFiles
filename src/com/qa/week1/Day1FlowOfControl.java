package com.qa.week1;

public class Day1FlowOfControl {
			//Flow of control is the order in which methods and functions are called and executed.
	
	public static void main(String[] args) { //This is the main method. This is the starting point for executing the code.
		//The main method can call other methods to be executed from within the main method. It is the Ring-master of the Java circus!
		
		    method1(); 	//calls method 1 (starting line 21). Does what method 1 tells it to do (i.e. prints "Hello" to the console). 
		    			//Method 1 is complete so the main method then moves to it's next command.
		    
		    method2();	//calls method 2 (starting line 25). Does what method 2 tells it to do (i.e. prints "World" to the console). 
						//Method 2 is complete so the main method then moves to it's next command.
		    
		    System.out.println(method3());	//calls method 3 (starting line 29). Method 3 'does its thing', which is to RETURN an exclamation mark
		    								//to the call from the main method. The main method then puts this RETURNed value into its method
		    								//(i.e. prints "!" to the console) 
											//There are no more methods so it stops.
		}
	
	public static void method1() {
	    System.out.println("Hello");
	}

	public static void method2() {
	    System.out.println("World");
	}

	public static String method3() {
	    return "!";
	}
	
}
