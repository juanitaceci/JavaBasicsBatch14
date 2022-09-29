package com.synthax.class04;

import java.util.Scanner;

public class CalendarMonths {

	public static void main(String[] args) {


		/*
		 * Task#3
		 * Create a Java program and declare int variable that will hold a month. 
		 * Based on the value of the variable your program should print the name of the month.
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter Month number");
		
		int month=scanner.nextInt();
		
		if (month==1) {
			System.out.println("The month is January");
		}else if(month==2) {
			System.out.println("The month is February");
		}else if(month==3) {
			System.out.println("The month is March");
		}else if(month==4) {
			System.out.println("The month is April");
		}else if(month==5) {
			System.out.println("The month is May");
		}else if(month==6) {
			System.out.println("The month is June");
		}else if(month==7) {
			System.out.println("The month is July");
		}else if(month==8) {
			System.out.println("The month is August");
		}else if(month==9) {
			System.out.println("The month is September");
		}else if(month==10) {
			System.out.println("The month is October");
		}else if(month==11) {
			System.out.println("The month is November");
		}else if(month==12) {
			System.out.println("The month is December");
		}else {
			System.out.println("Please enter a valid month");
		}
		}
		

	}


