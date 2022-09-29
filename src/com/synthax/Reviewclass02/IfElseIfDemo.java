package com.synthax.Reviewclass02;

public class IfElseIfDemo {

	public static void main(String[] args) {

		/*
		 * If we need one outcome based on if conditions we use
		 * If, if the outcomes are 2 we use If Else If outcomes are more 
		 * than that we can use If Else If
		 * 
		 * whenever you have to check more than 2 conditions always use If Else If Conditions
		 * 
		 */

		//Computer has to process 4 steps to process this code
		int number=12;
		
		if(number>0) {
			System.out.println("number is positive");
		}
		if(number<0) {
			System.out.println("number is negative");
		}
		if(number==0) {
			System.out.println("number is o");
		}
		
//-------------------------------------------------------------------------
		//Computer has to process 2 steps to process this code: This method is better because computer requires less number of steps to go through 
		
		if(number>0) {
			System.out.println("number is positive");
		}
		else if(number<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is o");
		}
	}

}
