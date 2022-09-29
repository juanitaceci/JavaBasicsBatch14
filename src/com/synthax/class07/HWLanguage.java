package com.synthax.class07;

import java.util.Scanner;

public class HWLanguage {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */

		String country, language;
		System.out.println("Please enter your country");
		Scanner scanner = new Scanner(System.in);
		country = scanner.nextLine();

		switch (country.toLowerCase()) { //Example to convert out to Upper or Lower case
		case "El Salvador":
			language = "Spanish";
			break;
		case "Korea":
			language = "Korean";
			break;
		case "Indian":
			language = "Hindi";
			break;
		case "Brazil":
			language = "Portuguese";
			break;
		case "Greece":
			language = "Greek";
			break;
		case "France":
			language = "French";
			break;
		case "Italy":
			language = "Italian";
			break;
		case "Germany":
			language = "German";
			break;
		case"Sweden":
			language="Swedish";
			break;
			default:
				language="Unknown";
				break;
		}
		System.out.println("Your language is "+language);

	}

}
