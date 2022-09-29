package com.synthax.Reviewclass02;

public class NestedIf {

	public static void main(String[] args) {

		/*
		 * Nested If conditions are conditions which are dependent on each other if outer condition is
		 * not true inner condition is never checked inner-condition are only checked when 
		 * outer condition is passed
		 */
		
		int money=12;
		
		if(money>10) { //output will be nothing because outer condition is false so will not be executed
			System.out.println("Lets buy some eggs");
			int noOfEggs=2;
			
			if(noOfEggs>0) {
				System.out.println("lets boil the eggs");
			}
		}

	}

}
