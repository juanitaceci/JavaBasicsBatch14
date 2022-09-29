package com.synthax.class07;

import java.util.Scanner;

public class DoWhileExamples {

	public static void main(String[] args) {

		/*
		 * In this example:
		 * if user enters No condition will be false so we will use !-if not Oper. 
		 * to make condition true Until user enters Yes condition will stop checking/asking because than it will become a false
		 */
		
		String answer;
		Scanner scanner=new Scanner(System.in);
		
		do {	
		System.out.println("Did you get a job");
		answer=scanner.nextLine(); //----> if user enters No condition will be false so we will use !-if not Oper. to make condition true 
		}while(!answer.equals("yes")); //Until user enters Yes condition will stop checking/asking because than it will become a false
		System.out.println("Congrats");
	}

}
