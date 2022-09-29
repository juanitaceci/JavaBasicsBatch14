package com.synthax.classRepls;

import java.util.Scanner;

public class Repl39 {

	public static void main(String[] args) {
		
	//1 to 25 - F 
    //25 to 45 - E 
    //45 to 50 - D 
    //50 to 60 - C
    //60 to 80 - B 
    //Above 80 - A 
    
    int mark;
    char grade=0;

    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter your mark");
    mark=scanner.nextInt();

    if(mark<=25 && mark>=0){
      grade='F';
    }else if(mark<=45 && mark>=24){
      grade='E';
    }else if(mark<=50 && mark>=44){
      grade='D';
    }else if(mark<=60 && mark>=49){
      grade='C';
    }else if(mark<=80 && mark>=59){
      grade='B';
    }else if(mark<=81){
      grade='A';
    }else{
      System.out.println("Please enter valid mark");
    }
    System.out.println("Your grade is "+grade);
		 

	}

}
