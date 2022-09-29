package com.synthax.class07;

import java.util.Scanner;

public class HWGradeClassification {

	public static void main(String[] args) {
		/*
		 * 2. Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, 
		 *  B-Good,
		 *  C-Average, 
		 *  D-Bad, any other grade --> Not Acceptable. 
		 *  At the end your program should print which grade was entered by a user with explanation. 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your Grade?");
		String grade=scanner.nextLine();
		String classification;
		
		switch(grade) {
		
		case "A":
			classification="Excellent";
			break;
		case "B":
			classification="Good";
			break;
		case "C":
			classification="Average";
			break;
		case "D":
			classification="Bad";
			break;
			default:
			classification="Not Acceptable";
			break;
		}
		System.out.println(grade+"= "+classification);
		


	}

}
