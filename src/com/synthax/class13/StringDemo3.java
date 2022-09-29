package com.synthax.class13;

public class StringDemo3 {
	
	public static void main(String[] args) {
	
		
		// Google "ascii table chart" stands for--> American Standard Code for Information Interchange
		
		//Replacing numbers from 0-9 with what you input "@" it will be removed and replaced
		String str="sfksSFKS11493!@$&";			
		System.out.println(str.replaceAll("[0-9]","@"));
		System.out.println(str.replaceAll("[sfks]",""));//This will remove the letters 
		System.out.println(str.replaceAll("[A-Z]","")); //will remove all uppercase
		System.out.println(str.replaceAll("[^A-Z]","")); // Use ^ symbol and will remove everything BUT Not Uppercase letters
		System.out.println(str.replaceAll("[^A-Z-0-9]",""));// here it will not remove a list of UpperCase and Numbers
		
		
	}
}
