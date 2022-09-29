package com.synthax.class08;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {


		// Print even numbers from 20 to 1 (2 ways)
		for (int i = 20; i >= 1; i -= 2) {
		System.out.print(i + " ");
		}
		
		//Second way to write same code using Mod %2
		
		System.out.println();
		System.out.println("*IF cond inside for loop**");
		for (int i = 20; i >= 1; i--) {
		if (i % 2 == 0) {
		System.out.print(i + " ");
		}
		}
		
		

	}

}
