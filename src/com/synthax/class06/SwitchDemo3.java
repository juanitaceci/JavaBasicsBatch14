package com.synthax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		
		/*
		 * We need to ask a user where he/she is from
		 * based on the country--> Define favorite food
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		String country=scanner.nextLine();
		String favoriteFood;
		
		switch(country) {
		
		case "usa":
			favoriteFood="Burgers and Fries";
			break;
		case "Kazakhstan":
			favoriteFood="Beshparmak";
			break;
		case "Turkey":
			favoriteFood="Adana Kebab";
			break;
		case "Venezuela":
			favoriteFood="Arepa";
			break;
		case "India":
			favoriteFood="Chicken Curry";
			break;
		case "Yemen":
			favoriteFood="Mandi";
			break;
		case "Afghanistan":
			favoriteFood="Qaboli Palow";
			break;
		case "El Salvador":
			favoriteFood="Pupusas Con Tamal de Elote";
			break;
			default:
				favoriteFood="Unkown";
				break;
		}
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);
		

	}

}
