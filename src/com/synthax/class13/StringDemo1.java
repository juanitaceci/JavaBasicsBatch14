package com.synthax.class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {


		String str="Today is Sunday";
		String day=str.substring(9); //9 is an argument that we are passing in this substring
		System.out.println(day); //Simple way of calling out index 9="Sunday"
		System.out.println(str.substring(6,8)); //Calling out a specific index "is"
		
		char c=str.charAt(4); //Calling the method charAt on str object
		System.out.println(str.charAt(4)); //To return back 1 only 
		
		//Two Char Array
		char[] charArr=str.toCharArray(); 
		System.out.println(Arrays.toString(charArr)); //Here String is kept as an Array and will print out as an Array
		System.out.println(charArr); //Here Array is converted back into a String and will print out as a String not an Array
		
		int index=str.indexOf("a");
		System.out.println(index); //output is the 1st letter "a"
		System.out.println(str.indexOf("a",6)); //Get input for the 2nd "a"
		
		
	}

}
