package com.synthax.class04;

import java.util.Scanner;

public class inputFromKeyboard3 {

	public static void main(String[] args) {
		/*
		 * Just using scanner to confuse Asma
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter your name");
		//takes a string type input from the keyboard and stores it in name variable
		String name=scanner.nextLine();
		System.out.println("Please Enter your age");
		////takes an int type input from the keyboard and stores it in age variable
		int age=scanner.nextInt();
		
		System.out.println("Hi "+name+" You are "+age+" years old");

	}

}
