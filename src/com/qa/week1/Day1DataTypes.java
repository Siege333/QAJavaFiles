package com.qa.week1;

public class Day1DataTypes {
		
		//First method
		public void noReturn() {
	        System.out.println("No value returned");
	    }

		//Second method
	    public String withReturn() {
	        System.out.println("Value returned");
	        return "Hello World";
	    }
		
	    
	    
	    //This is the start of the main method
		public void main(String[] args) {
		
		noReturn(); 	//this is calling the first method - noReturn()
		
		withReturn(); 	//this is calling the second method - withReturn()
		
		}
		
		//Declare data types as follows:
	// data type   variable
		boolean     bool;
		byte        bytes;
		char        character;
		short       number;
		int         anotherNumber;
		long        aLongNumber;
		float       decimalNumber;
		double      anotherDecimalNumber;
		
		
		//Initialise data type variables with values:
		//data type 	variable name			value
		boolean 		bool1 					= true;
		byte 			bytes1 					= 8;
		char 			character1 				= 'A';
		short 			number1 				= 16;
		int 			anotherNumber1 			= 32;
		long 			aLongNumber1 			= 64L;
		float 			decimalNumber1 			= 3.2f;
		double 			anotherDecimalNumber1 	= 6.4d;
		
		
		//Methods declaring expected return data type
		public int methodName1() {
		    return 0;
		}
		public boolean methodName2() {
		    return true;
		}
		public char methodName3() {
		    return 'P';
		}
		public long methodName4() {
		    return 52L;
		}
		public float methodName5() {
		    return 0.6f;
		}
		public String methodName6() {
		    return "Hi there";
		}
		public void methodName7() {
		    // no return
		}
	}