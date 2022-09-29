package com.synthax.class13;

public class StringUtils {


	//Creating our own method to call out all index 
	public void printAllIndexes(String str,char c) {
		for(int i=0; i<str.length(); i++) {
			
			if (str.charAt(i)==c) {
				System.out.println(i);
			}
		}
		

	}

}
