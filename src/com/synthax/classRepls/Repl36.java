package com.synthax.classRepls;

import java.util.Scanner;

public class Repl36 {

	public static void main(String[] args) {
		/*
		 * Prompt user to input two strings : "Please enter two strings"and two
		 * integers: "Please enter two numbers"
		 * 
		 * and make the comparisons:
		 * 
		 * if int1 and int2 are equal and word1 and word2 are equal, output "AND" if
		 * int1 and int2 are equal or word1 and word2 are equal, output "OR" if int1 and
		 * int2 are not equal and word1 and word2 are not equal, output "NONE"
		 * 
		 * **Example input/output:** 
		 * word1: banana 
		 * word2: banana 
		 * int1: 2 
		 * int2: 2 
		 * Output:
		 * AND
		 * 
		 * word1: phone 
		 * word2: pie
		 *  int1: 2 
		 *  int2: 3 
		 *  Output: NONE
		 */
		
		Scanner scanner=new Scanner(System.in);

		  String word1, word2;
		  int int1, int2;

		  System.out.println("Please enter two strings");
		  word1=scanner.nextLine();
		  word2=scanner.nextLine();
		  System.out.println("Please enter two numbers");
		  int1=scanner.nextInt();
		  int2=scanner.nextInt();

		  if(int1==int2 && word1.equals(word2)){
		    System.out.println("And");
		  }else if(int1==int2 || word1.equals(word2)){
		    System.out.println("OR");
		  }else if(int1==int2 && !word1.equals(word2)){
		    System.out.println("NONE");
		  }

	}

}
