package com.synthax.class07;

import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user. 
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
	
		System.out.println("**************Calculator using If Statement******************");
		
		Scanner scanner=new Scanner(System.in);
		double num1, num2, result;
		char operator;
			
		System.out.println("To use calculator please enter your 1st number");
		 num1=scanner.nextDouble();
		 System.out.println("Enter your operator +,-,* or /");
		 operator=scanner.next().charAt(0);
		 System.out.println("Please enter your 2nd number");
		 num2=scanner.nextDouble();
		 
		  if(operator=='+') {
			 result=num1+num2;
			 System.out.println(num1+" " +operator+ " " +num2+"="+result);
		 }else if(operator=='-') {
			 result=num1-num2;
			 System.out.println(num1+" "+operator+" "+num2+"="+result);
		 }else if(operator=='*') {
			 result=num1*num2;
			 System.out.println(num1+" "+operator+" "+num2+"="+result);
		 }else if(operator=='/') {
			 result=num1/num2;
			 System.out.println(num1+" "+operator+" "+num2+"="+result);
		 }else {
			 System.out.println("Invalid Operation"); 
		 }	
			
		System.out.println("**************Caluculator using Switch Case******************");
		 
		switch (operator) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
			default:
				result=0;
				break;
		}
				System.out.println(num1+ " "+operator+" "+num2+" ="+result);
	
	}
}
