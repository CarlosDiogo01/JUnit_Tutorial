package com.myJunitTutorial;

public class Main { 
	
	public static void main(String[] args) {
	
		String aname="Carlos";
		String last="Sa";
		String firstAndLast="";
		
		Nameop n = new Nameop(aname);
		
		firstAndLast = n.appendsLastName(last);
		
		System.out.println(firstAndLast);
	}
}
