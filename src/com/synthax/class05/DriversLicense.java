package com.synthax.class05;

import java.util.Scanner;

public class DriversLicense {

	public static void main(String[] args) {


		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them,
		 * otherwise you will offer them to get a learners permit.
		 */

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter Your Age");
		int age= scanner.nextInt();
		if(age>=18) {
			System.out.println("Driver's License Has Been Issued");
		}else {
			System.out.println("You May Apply for a Learners Permit");
		}
	}

}
