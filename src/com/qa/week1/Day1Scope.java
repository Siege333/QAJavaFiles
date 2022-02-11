package com.qa.week1;

public class Day1Scope {

	public static String message1 = "This is Class level scope"; //CLASS LEVEL scope (AKA instance level scope). 
	//Variable is usable throughout the whole class as it is defined outside the main method (usually at the top of the class file).

    public static void method1() {
        System.out.println(message1); //method1 is referencing the variable "message1" but the variable is defined outside the method.
        
    }
		
	public static void main(String[] args) {
	
		method1();
		method2();
		method3();
	}
	
	public static void method2() {  		//METHOD LEVEL scope (AKA local level scope).
        String message2 = "This is Method level scope"; 	//method2 defines the variable "message2" within the method. 
        System.out.println(message2); 		//"message2" will not be available outside method2. 
    }
	 
	public static void method3() {			//LOOP LEVEL scope.
	        for(int i = 0; i < 5; i++) {	//variable "i" is only temporary for the duration of the loop.
	            int number = 20;
	            number += i;				//variable "number" is also only available for the duration of the for loop.
	            System.out.println(number);
	            }
	        System.out.println("\"number\" doesn't exist now the loop has finished");
	    }
	}
