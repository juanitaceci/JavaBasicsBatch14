package com.synthax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		
		int time=10;
		
		/* Infinite Loop:
		 * 
		 * if(time < 12) {
			System.out.println("Good morning");
		}
		while (time < 12) {
			System.out.println("good morning");
			
		} */

		while ( time < 12) {
			System.out.println("Good morning");
			time++; //10 + 1=11 + 1=12 --> will loop 2 times once conditions because false it stops
		}
		
		//Code will not be executed because it is a False Condition
		while(time <12) {
			System.out.println("Good morning inside while loop");
			time++;  
		}
		
		
	}

}
