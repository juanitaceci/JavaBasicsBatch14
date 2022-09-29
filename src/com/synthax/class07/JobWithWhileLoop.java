package com.synthax.class07;

import java.util.Scanner;

public class JobWithWhileLoop {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		String answer;
		
		System.out.println("Did you get a job");
		answer=scanner.nextLine();
		
		while(!answer.equals("yes")) {
			System.out.println("Did you get a job");
			answer=scanner.nextLine();
		}

	}

}
