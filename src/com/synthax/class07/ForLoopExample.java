package com.synthax.class07;

public class ForLoopExample {

	public static void main(String[] args) {


		for(int i=10;i<=25; i+=5) {
			System.out.println(i+" ");
		}
		
		System.out.println("**********************");
		
		int sum=0;
		
		for(int i=1; i<=6; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
