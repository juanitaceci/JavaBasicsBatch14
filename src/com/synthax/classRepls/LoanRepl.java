package com.synthax.classRepls;

import java.util.Scanner;

public class LoanRepl {

	public static void main(String[] args) {
		// 

		boolean loan=true;
		   int score;
		   Scanner scanner=new Scanner(System.in);
		   
		  System.out.println("Do you need a loan?");
		   loan=scanner.nextBoolean();

		   if(loan){
		     System.out.println("What is your credit score?");
		     score=scanner.nextInt();
		     if(score<=600){
		       System.out.println("Not eligible");
		     }else if(score>=600 && score<=700){
		       System.out.println("Maybe eligible");
		     }else if(score>=701 && score<=800){
		       System.out.println("Eligible");
		     }else if(score>=801){
		       System.out.println("Definitely eligible");
		     }
		   }else{
		     System.out.println("Unkow");
		   }
		   

	}

}
