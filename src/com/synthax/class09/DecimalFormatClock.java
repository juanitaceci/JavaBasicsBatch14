package com.synthax.class09;

import java.text.DecimalFormat;

public class DecimalFormatClock {

	public static void main(String[] args) {


		/*
		 * Create a digital clock using nested loops
		 * If you can, try to have a clock that would show 2 digits for hour and 2 digits for minutes
		 * 
		 * Bringing out Decimal Format class
		 */
		
		
		 int h,m;
		
		 DecimalFormat formatter=new DecimalFormat("00");
		
		for(h=0; h<=24; h++) {
			for(m=0; m<60; m++) {
				System.out.println(formatter.format(h)+":"+formatter.format(m));
				}
			
				}
			}
	}

