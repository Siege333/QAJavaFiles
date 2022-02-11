package com.qa.week1;

import java.util.Random;

public class Day1FlowOfControlCallStack {

	    public static void main(String[] args) {
	        System.out.println(rollTwoDTwenty());
	    }

	    public static int rollTwoDTwenty() {
	        int total = 0;
	        total += rollDTwenty();
	        total += rollDTwenty();
	        return total;
	    }

	    public static int rollDTwenty() {
	        return new Random().nextInt(21);
	    }
	  //Call Stack - made up of stack frames - used to keep track of the order that methods are called in.
		//A stack frame is created from each method call then added to the call stack. Uses Last in, First out method (LIFO)
	    
	    //Call stack becomes:
	    					//rollTwoDTwenty() 			First stack frame - this calls rollDTwenty()

	  
	    //Call stack becomes:
	    					//rollDTwenty()				Second stack frame - this calls Random().nextint()
	    					//rollTwoDTwenty() 			First stack frame
	    
	    
	    //Call stack becomes:
	    					//Random().nextint()		Third stack frame
	    					//rollDTwenty()				Second stack frame - this calls Random().nextint()
	    					//rollTwoDTwenty()			First stack frame
	    
	    
	  //Random().nextint() returns a value and so is popped off the list as it is complete.
	    
	    
	    //Call stack becomes:
							//rollDTwenty()				Second stack frame
							//rollTwoDTwenty() 			First stack frame
	    
	  //rollDTwenty() returns the new value to rollTwoDTwenty() and so is popped off the list as it is complete.
	    
	    //Call stack becomes:
							//rollTwoDTwenty() 			First stack frame
	    
	  //rollTwoDTwenty() calls rollDTwenty() again so the stack is repeated until a final value is reported back to total 
	  //and then reported back to rollTwoDTwenty()
	    
}



