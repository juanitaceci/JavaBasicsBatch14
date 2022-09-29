package com.synthax.class06;

import java.util.Scanner;

public class EnchancedBirthMonth {

	public static void main(String[] args) {
		/*
		 * Enhance HW code: Write a program for user to enter his/hers birth month.
		 * Based on the month define the season. Example: if user is born in March,
		 * April, May → season =”Spring” if user is born in June, July, August → season
		 * =”Summer” etc … At the end of the program we should see 1 output as “You were
		 * born is season __”.
		 */

		System.out.println("Please Enter your Birth month");
		Scanner scanner=new Scanner(System.in);
		String month=scanner.nextLine();
		
		String Season=null;
		
		if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			Season="Winter";
		}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			Season="Spring";
		}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			Season="Summer";
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			Season="Fall";
		}else {
			System.out.println("Please eneter a Valid Month");
		}
		System.out.println(Season+" is the season you were born in ");
	}

}
