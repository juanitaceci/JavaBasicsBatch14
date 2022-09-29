package com.synthax.class13;

public class Task2 {

	public static void main(String[] args) {
		
		
		/*
		 * Create a String and print it in reverse order (Sunday-->yadnus).
		 */

		
		String str="Sunday";
		
		for(int i=str.length()-1;  i>=0;  i--) {
			System.out.print(str.charAt(i));
			
			System.out.println();
			
			
		}
	}

}
