package com.synthax.class07;

public class DoWhileLoopDemo {

	public static void main(String[] args) {

		/*
		 * Do-While-Loop lets you enter a loop without any condition and you add a While to add a condition.
		 * 
		 * While vs. Do While --> both loops execute while condition is true
		 * 
		 * While Loop- 1st check condition-->if true-->executes code
		 * Do While Loop- 1st executes code--> then checks condition
		 * For Loop- When we know which loop to use--> when we know in advance how many times to repeat block of code
		 * 
		 * When To Use Which Loop?
		 * When we know in advance how many times to repeat block of code--> Use FOR LOOP
		 * When we do not know in advance how many times to repeat block of code use--> WHILE LOOP or DO WHILE LOOP
		 */
		
		System.out.println("********** This is a While Loop **********");
		//While is a simple condition
		
		int num=1;
		
		while(num<=3) {   //Condition will be true 3x's
			System.out.println("I am while loop");
			num++;
		}
		System.out.println("************ This is a Do While Loop*******************");
		
		int num1=1;
		
		do {
			System.out.println("I am Do While Loop");
			num1++;
		}while(num1<=3);
		
		System.out.println("***************I am a For Loop ******************");
		//For Loop Syntax---> For(Start point; End point; Do you want o increment/Decrement){}
		
		for(int i=1; i<=5; i++) {
			System.out.println(i+".Hello");
		}

		System.out.println("********** New Example 1-20 **********");
		//Print numbers from 1-20
		
		for(int i=1; i<=20; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.println("********** New Example: 30-10 Backwards **********");
		//Print numbers from 30-10
		
		for(int i=30; i>=10; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.println("********** New Example: counting by 2's **********");
		//What is the output
		
		for(int i=0; i<=10; i+=2) {
			System.out.print(i+" ");
		}
	}

}