package com.qa.week2;
		//Exercise1 - Create two Strings where one string has a value of “yesterday it was raining” 
		//and the other string with a value of “today it is sunny”

		//Concatenate both values, capitalise both strings and print out the result.
		//The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
public class Day1StringManipulation {

	public static void main(String args[]) {

		//Method one - my method
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		
		String myString = str2 + ", " + str1;
		
		System.out.println(myString.toUpperCase());
	
		//Method two - provided example
		String str3 = "yesterday it was raining";
		String str4 = "today it is sunny";
		System.out.println(str4.toUpperCase()+", "+str3.toUpperCase());
		
		
		//Now use the substring method to print out: `TODAY IT IS RAINING`
		System.out.println(str4.substring(0, 11).toUpperCase() + " " + (str3.substring(17, 24)).toUpperCase());
	}
			
}