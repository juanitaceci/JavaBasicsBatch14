package com.synthax.class06;

import java.util.Scanner;

public class QuizScore {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		 * and determine the grade based on the following rules: 
		 * if the average score >=90--> grade=A 
		 * if the average score >= 70 and <90--> grade=B 
		 * if the average score>=50 and <70--> grade=C 
		 * if the average score<50--> grade=F
		 */
		
		Scanner scanner;
		int quiz, MidTerm, Final, Average;
		char grade=0;
		
		scanner=new Scanner(System.in);
		
		System.out.println("Please enter your Quiz score");
		quiz=scanner.nextInt();
		System.out.println("Please enter your Mid-Term score");
		MidTerm=scanner.nextInt();
		System.out.println("Please enter your Final Score");
		Final=scanner.nextInt();
		Average=(quiz+MidTerm+Final)/3;
		
		if(Average<=100 && Average>=90) { 
			grade='A';
		}else if(Average<=90 && Average>=70) {
			grade='B';
		}else if(Average<=70 && Average>=50) {
			grade='C';
		}else if(Average<=50 && Average>=0) {
			grade='F';
		}
		System.out.println("With an Avaerage socre of "+Average+" Your grade is= "+grade);
	}

}
