package com.synthax.class08;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {


		/*
		 * Declare a variable to store a price for a coffee. Ask the user to 
		pay for a
		 * coffee. Keep asking to pay for coffee until the user enters the 
		EXACT amount
		 * . If the user gives more than coffee price --> ask them to give 
		less, if the
		 * user gives less money then ask to give more. Once user give EXACT 
		amount
		 * print “Please enjoy your coffee
		 */
		
		double price = 2.85;
		double user;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please pay for the cofee");
		
		do {
		user = in.nextDouble();
		if (user > price) {
		System.out.println("Please give lesser price");
		} else if (user < price) {
		System.out.println("Please give more price");
		}// When condition for If Statement and Else If statement is being checked it comes to while and if user does not give exact price go back 
		} while (user != price); //Condition is true and will repeat loop until False
		System.out.println("Enjoy your coffee");

	}

}
