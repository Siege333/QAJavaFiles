package com.qa.week2;

public class Day1StringManipulationEx2 {

	public static void main(String[] args) {
		//Method 1 - When given a String, count and return how many words there are in that String.
		String myStringToCount = "This is my string to be counted";
								
		for(int i = 0; i <= myStringToCount.length(); i++) {
			
					System.out.println(i);
		}
	}

}
//For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the 
//length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of 
//the exercise:
//
//Method 1 - When given a String, count and return how many words there are in that String.
//Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
//Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
//Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. 
//A boolean value should be returned to indicate whether or not the second String has been found in the message.