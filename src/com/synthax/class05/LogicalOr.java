package com.synthax.class05;

public class LogicalOr {

	public static void main(String[] args) {


		/*
		 *  Logical OR || ----> ONE OF THE STATEMENTS MUST BE TRUE FOR OUTPUT TO BE TRUE
		 *  
		 *  True  || True = True
		 *  True  || False= True
		 *  False || True= True
		 *  False || False= False
		 */
		
		String day="Saturday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) { // True || False = Condition is True output will execute
			System.out.println("I have Java Class at syntax");
		}

		
		System.out.println("***********Logical OR using 2 different data type********************");
		
		double money=12000;
		String title="Automation Tester";
		
		if(title.equals("Automation Tester") || money==120000) { // True || True== Both condition or 1 is True output will be executed
			System.out.println(" I will be Happy ");
		}
		
	}

}
