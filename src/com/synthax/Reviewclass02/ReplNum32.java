package com.synthax.Reviewclass02;

import java.util.Scanner;

public class ReplNum32 {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your gender: M or F");
		   char gender=scanner.next().charAt(0);
		   
		   System.out.println("Please enter your age");
		   int age= scanner.nextInt();

		        if(gender=='f'){
		          System.out.println("Women");
		        }else{
		          System.out.println("Man");
		          {
		        if(age<25){
		          System.out.println("Girl");
		        }else{
		          System.out.println("Boy");
		        }
		      }
}
	}
}