package com.synthax.class05;

import java.util.Scanner;

public class NextVsNextLine {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter full name");
	
		String name=scanner.next(); // .next() will only capture 1st word .nextLine() will capture everything in that line
		System.out.println(name);
	
	}	
}
