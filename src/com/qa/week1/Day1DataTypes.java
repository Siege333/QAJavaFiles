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
	}
