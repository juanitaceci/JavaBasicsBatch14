package com.synthax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * 1. Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following:
		 *  � short (under 60 inch) 
		 *  � medium(between 60 -72 inch) 
		 *  � tall (over 72 inch) 2.
		 * 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your hight in Inches");
		int height=scanner.nextInt();
		
		if(height<=60) {
			System.out.println("Short");
		}else if(height>60 && height<=72) {
				System.out.println("Medium");
		}else if(height>72) {
					System.out.println("Tall");
				}else {
					System.out.println("Your height is not normal");
				}

	}

}
