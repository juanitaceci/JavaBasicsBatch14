package com.synthax.class06;

import java.util.Scanner;

public class HwBirthMonth {

	public static void main(String[] args) {
		/*
		 * HW 2.Write a program for user to enter his/hers birth month. 
		 * Based on the month define the season. Example: if user is born in 
		 * • March, April, May --> season =”Spring”
		 * • June, July, August --> season =”Summer” 
		 * etc …
		 */
		
		System.out.println("Please Enter your Birth month");
		Scanner scanner=new Scanner(System.in);
		String month=scanner.nextLine();
		
		if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			System.out.println("You were born in the Winter");
		}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You were born in the Spring");
		}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("You were born in the Summer");
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("You were born in the Fall");
		}else {
			System.out.println("Please eneter a Valid Month");
		}

	}

}
