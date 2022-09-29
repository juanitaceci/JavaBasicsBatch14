package com.synthax.class05;

import java.util.Scanner;

public class Recap2 {

	public static void main(String[] args) {


		boolean allergy=true;
		
		String allergyType="pollen";
		
		if(allergy) {
			System.out.println("Lets check what allergy you have");
			
				if(allergyType.equalsIgnoreCase("Pollen")) {
					System.out.println("Try to stay indoors when tress are blooming");
				}else if(allergyType.equalsIgnoreCase("Peanut")) {
					System.out.println("PLease stay away from Peanuts");
				}else if(allergyType.equalsIgnoreCase("Dairy")) {
					System.out.println("Stay away from Dairy products");
				}else {
					System.out.println("Your allergy is not listed");
				}
			
		}else {
			System.out.println("You are lucky");
		}

	}

}
