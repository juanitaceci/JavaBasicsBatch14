package com.synthax.classRepls;

import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {


		int daynum;
		  String day;
		  
		  Scanner scanner=new Scanner(System.in);
		  //System.out.println("Please enter day of the week");
		  daynum=scanner.nextInt();
		  
		  String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Staurday"};

		  switch(daynum){

		    case 1:
		      day="Sunday";
		      break;
		    case 2:
		      day="Monday";
		      break;
		    case 3:
		      day="Tuesday";
		      break;
		    case 4:
		      day="Wednesday";
		      break;
		    case 5:
		      day="Thursday";
		      break;
		    case 6:
		      day="Friday";
		      break;
		    case 7:
		      day="Saturday";
		      break;
		    default:
		      day="Invalid Number";
		      break;
		  }
		  
		  for (String weekdays : days) {
				System.out.println(weekdays);
				}

	}

}
