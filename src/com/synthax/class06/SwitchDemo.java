package com.synthax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		/*
		 * If Statements and Case Statements are the 2 different statements used in Java to test multiple conditions.
		 * Switch case is values based-It knows the values--> jump into matching case
		 * 
		 * Switch can only check for Equality there for: Switch Case has some limitations:
		 * Matching cases must have same data type as your variable
		 * No duplicated cases in Switch.
		 * Can not use logical Operators
		 * Can not use Relational Operators
		 * Can not use with Boolean values
		 * Can not use with float, Double and Long Data Type
		 */
		
		int day=5;
		String name;

		switch(day) {
		
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7:
			name="Sunday";
			break;
		default:
			name="Invalid";
			break;
		}
		
		System.out.println(name);
	}
}
