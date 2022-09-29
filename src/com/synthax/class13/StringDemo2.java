package com.synthax.class13;

public class StringDemo2 {

	public static void main(String[] args) {


		String str="Thor love and thunder"; //To find te index of all the letter "o"
		
		StringUtils strUtils=new StringUtils();//created our own method to use in another class
		strUtils.printAllIndexes(str, 'e');
		
		
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='o') {
				System.out.println(i);
				//Output will print out 2 and 6 the 1st 'o' is in index=2 and the 2nd 'o' is in index=6
			}
		}
		

	}

}
