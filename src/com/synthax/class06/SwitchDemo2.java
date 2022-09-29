package com.synthax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {


		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case'Y':
			answer="Yes";
			break;
		case'N':
			answer="No";
			break;
		case'M':
			answer="Maybe";
			break;
		default:
			answer="Unkown";
			break;
		}
		
		System.out.println(answer);
		
	}

}
