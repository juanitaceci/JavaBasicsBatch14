package com.synthax.class07;

public class WhileLoopClassTask {

	public static void main(String[] args) {

		/*
		 * Task#1: Print numbers from 100 to 1
		 * 
		 * Task#2: Print even numbers from 20 to 100
		 * 
		 * Task#3: Print only odd numbers from 100 to 1
		 */

		System.out.println("*********** Task 1 **************");
		/*
		 * Task#1: 
		 * Print numbers from 100 to 1
		 */
		int num1=100;
		
		while(num1>=1) {
			System.out.print(num1+" ");
			num1--;
		}
		
		System.out.println(" ");
		System.out.println("*********** Task 2 **************");
		/* 
		 * Task#2: 
		 * Print even numbers from 20 to 100
		 */	
		int num2=20;
		
		while(num2<=100) {
			
			if (num2%2==0) {
				System.out.print(num2+" ");
			}
		num2++;
		}
		
		System.out.println(" ");
				System.out.println("*********** Task 3 **************");
		/* 
		 * Task#3: 
		 * Print only odd numbers from 100 to 1
		 */
		int num3=99;
		
		while(num3>=1) {
			System.out.print(num3+" ");
			num3-=2;
		}	
	}
}
