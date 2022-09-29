package com.synthax.class06;

import java.util.Scanner;

public class HwTime {

	public static void main(String[] args) {

		/*
		 * 1. Write a program that will ask user to input the current time 
		 * (use 24 hour format). Based on the given time define: 
		 * • if hour is between 1-11--> Morning 
		 * • if hour between 12-15 --> Afternoon 
		 * • if hour between 16-20 --> Evening
		 * • if hour between 21-24 --> Night
		 * 
		 */
		
		System.out.println("Please enter the time using 24hr format");
		Scanner scanner=new Scanner(System.in);
		int time=scanner.nextInt();
		
		if(time>=1 && time<=11) {
			System.out.println("Morning Time");
		}else if(time>=12 && time<=15) {
			System.out.println("Afternoon Time");
		}else if(time>=16 && time<=20) {
			System.out.println("Evening Time");
		}else if(time>=21 && time<=24) {
			System.out.println("Night Time");
		}else {
			System.out.println("Please enter correct time");
		}
}
}