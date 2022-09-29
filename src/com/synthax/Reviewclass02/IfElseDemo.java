package com.synthax.Reviewclass02;

public class IfElseDemo {

	public static void main(String[] args) {

		//When using Strings to check if it is equal to, you must write out the word-->.equals("password123")
		//When the data type is primitive we use == like char, int, short etc..
		//When we use the data types are non-primitive like String we use .equals()
		
		String userName="Admin";
		String password="password123";
		if(password.equals("password123")) {
			System.out.println("Welcome "+userName);
		}else {
			System.out.println("Wrong password"+userName);
		}
		

	}

}
