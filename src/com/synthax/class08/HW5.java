package com.synthax.class08;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {


		/*
		 * Prompt the user to ask the name 3 times and print "Good afternoon 
		+name...
		 */
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
		System.out.println("Please write a name");
		String name = input.nextLine();
		System.out.println("Good afternoon " + name);
		System.out.println("---------------------------------");
		}

	}

}
