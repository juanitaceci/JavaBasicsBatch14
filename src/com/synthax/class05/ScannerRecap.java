package com.synthax.class05;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		
		// Importing Scanner Shortcut:
		// Windows: Ctrl+shift+o
		// Mac:  cmd+shift+o
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name=scanner.next();// Capturing String
		System.out.println("Nice to meet you "+name);
		
		System.out.println("How old are you "+name);
		int age=scanner.nextInt(); // Capturing Int
		System.out.println(name+" is "+age+" years old");
		
		System.out.println("How much money you have "+name);
		double money=scanner.nextDouble();
		System.out.println(name+" has $"+money);
		
		System.out.println(name+" what is your grade?");
		char grade=scanner.next().charAt(0); // Capturing a string in:(next) and than capturing an index in:charAt(0) 
		System.out.println(name+" has grade "+grade);
		
		
		System.out.println("End");
		

	}

}
