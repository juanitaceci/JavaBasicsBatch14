package com.synthax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * 2. Write a program that will print whether it is a weekend or weekday. 
		 * • If any day from 1-5--> output “It is a weekday” 
		 * • any day from 6-7 --> output “It is a weekend” 
		 * • any other day --> output “Invalid day”
		 * 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the day number");
		int day=scanner.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("It is a Weekday");
		}else if(day>=6 && day<=7) {
			System.out.println("It is the Weekend");
		}else {
			System.out.println("Invalid Day");
		}

	}

}
