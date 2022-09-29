package com.synthax.class13;

import java.util.Arrays;

public class StringDemo4 {

	public static void main(String[] args) {


		String str="Batch 14 is really good";
		String [] arr=str.split(" ");//will print out in form of an Array List splitting where you are specify-->splits here after every space
		System.out.println(Arrays.toString(arr));//output is--> "[Batch, 14, is, really, good]"
		System.out.println(arr[2]); //will print out in that index --> "is" strating from 0
		
		String str2="Today is Sunday. Sunday is good. Java is also good";
		String [] arr2=str2.split("[.]"); //Creates spaces after every "." and removes it in printout
		System.out.println(Arrays.toString(arr2));
	}

}
