package com.synthax.class05;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {


		/*
		 * Question#2
		 * Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house, 
		 * otherwise user will consider buying. 
		 * 
		 * Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, 
		 * otherwise user will pay cash you are a loan specialist and you need to ask user what is the amount of loan is needed
		 * 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client. 
		 * 
		 */

		Scanner scanner=new Scanner (System.in);
		System.out.println("Please Enter your Mortgage Rate");
		double mortgage=scanner.nextDouble();
		
		if(mortgage>=4.5) {
			System.out.println("Client will Not buy a Home");
		}else {
			System.out.println("Client will buy a Home");
			System.out.println("Please enter Price of Home");
			int price=scanner.nextInt();
			if(price>=200000) {
				System.out.println("Client should take a loan");
				System.out.println("Please enter Loan amount needed?");
				int loan=scanner.nextInt();
				if(loan<=200000) {
					System.out.println("Loan has been Accepted");
				}else {
					System.out.println("Loan has been Rejected");
				}
			}else {
				System.out.println("Client is Paying in Cash");
			}
			
		}
	}

}
