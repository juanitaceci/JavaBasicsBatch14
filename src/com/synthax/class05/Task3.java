package com.synthax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * 3. Ask user to enter a number and then define if number is small, medium or
		 * large Small number 
		 * • value between 1 and 10 = small number 
		 * • value between 11 and 100 = Medium number 
		 * • value between 101 and 1000 = Large number
		 * 
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scanner.nextInt();
		
		if(num>=1 && num<=10) {
			System.out.println("Small Number");
		}else if(num>=11 && num<=100) {
			System.out.println("Medium Number");
		}else if(num>=101 && num<=1000) {
			System.out.println("Large Number");
		}else {
			System.out.println("Your number is Larger than 1000");
		}
	}

}
