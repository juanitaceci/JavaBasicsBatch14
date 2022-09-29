package com.synthax.class05;

import java.util.Scanner;

public class HighSchoolDiploma {

	public static void main(String[] args) {


		/*
		 * Write a program to store a Boolean value of whether user has diploma or not. 
		 * If user has a diploma, you should say congratulations, 
		 * otherwise program should suggest to get a degree. 
		 * Then if user has a degree program should check a GPA score. 
		 * If GPA score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
		 * otherwise → “You should have studied harder” 
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a High School Diploma? ");
		boolean diploma=scanner.nextBoolean();
		
		if(diploma) {
			System.out.println("Congratulations!");
			System.out.println("Enter your GPA score?");
			
			double GPA=scanner.nextDouble();
			if(GPA>=3.5) {
				System.out.println("You are eligable for Scholarship");
			}else{
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("Go get a Diploma");
		}
		
	}

}
