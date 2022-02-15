package com.qa.week1;

public class ClassMembers { //Class members are either variables or methods within a class.
							//Each class member can be an instance member, a static class member, and can also be final.
							//This example is of Instance members. 
	
		    private String firstName;
		    private String surname;

		    public void Customer(String firstName, String surname) {
		        this.firstName = firstName;
		        this.surname = surname;
		    }

		    public String getSurname() {
		        return surname;
		    }

		    public void setSurname(String surname) {
		        this.surname = surname;
		    }

		    public String getFirstName() {
		        return firstName;
		    }

		    public void setFirstName(String firstName) {
		        this.firstName = firstName;
		    }

	}