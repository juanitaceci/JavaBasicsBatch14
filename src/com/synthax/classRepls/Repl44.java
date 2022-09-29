package com.synthax.classRepls;

import java.util.Scanner;

public class Repl44 {

	public static void main(String[] args) {


		String carMake, carOrigin;

		  Scanner scanner=new Scanner(System.in);
		  System.out.println("Please enter your favorite car make");
		  carMake=scanner.nextLine();

		  switch (carMake){

		    case "BMW":
		      carOrigin="Your favorite car is german car";
		      break;
		    case "Toyota":
		      carOrigin="Your favorite car is japanese car";
		      break;
		    case "Maserati":
		      carOrigin="Your favorite car is italian car";
		      break;
		    default:
		      carOrigin="unknown";
		      break;
		  }
		  System.out.println(carOrigin);

	}

}
