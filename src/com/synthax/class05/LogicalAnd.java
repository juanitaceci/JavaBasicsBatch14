package com.synthax.class05;

public class LogicalAnd {

	public static void main(String[] args) {


		boolean understandJava=false;
		boolean enjoyJava=true;
		
		if(understandJava && enjoyJava) { //Testing 2 conditions at once both must be true or have an Else statement
			System.out.println("This is awesome");
		}else {
			System.out.println(" Than Java is not for you");
		}

		
		System.out.println("******************Another Example**************************");
		
		int n1=100;
		int n2=200;
		int n3=3000;
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" is the largest"); //False&&False= Condition is False No execution
		}else if(n2>n3 && n2>n1) {
			System.out.println(n2+" is the largest"); //False&&True= Condition is False No execution
		}else if(n3>n1 && n3>n2) {
			System.out.println(n3+" is the largest"); //True&&True= Condition is True statement will get executed
		}
	}

}
