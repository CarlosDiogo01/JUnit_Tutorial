package com.myJunitTutorial;

public class Nameop {
	
	private String name;
	
	/* Getters and setters */
	public void setName(String name) {
		this.name = name;
	}	
	public String getName() {
		return this.name;
	}
	
	/* Constructor */
	public Nameop(String oneName) {
		this.setName(oneName);
	}

	/* Methods */
	public String appendsLastName(String lastname) {
		String firstAndLastName="";
		
		if (lastname!=null) {
			firstAndLastName = this.name + " " + lastname;
		}
		else firstAndLastName = this.name;
	
	return firstAndLastName;
	}
}

