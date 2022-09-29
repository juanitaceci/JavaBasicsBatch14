package com.synthax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		int time=9;
		String day="Mondays";
		
		/*
		 * It is called outer if-condition if it is true then only inner condition will be closed 
		 * if is false nothing from inner if conditions will be executed. If is like the main door
		 * if main door is closed we can't enter the building
		 */
		
		//outer if-condition
		if(day.equals("Monday")) { //as String is a non primitive we can't use == sign we have to use .equal method
			
			//inner if-conditions
			if(time>7) {
				System.out.println("Lets go to office");
			}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		
		}
		
		
	}

}
