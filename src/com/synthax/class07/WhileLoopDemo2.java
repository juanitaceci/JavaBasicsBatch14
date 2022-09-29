package com.synthax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {


		//Print all numbers from 1-10
		System.out.println("************ 1-10 *********************");
		
		int num=1;
		
		while(num<=10) {
			System.out.println(num+" ");
			num++;
		}

		System.out.println("************ 10-25 *********************");
		
		//Print all numbers from 10-25
		int a=10;
		
		while(a<=25) {
			System.out.println(a+" ");
			a++;
					}
		System.out.println("************ 10-1 *********************");
		
		//Print all numbers from 10-1
		int b=10;
		
		while(b>=1) {
			System.out.println(b+" ");
			b--;
		}
		
		
		System.out.println("************** Task 1 ***********************");
		/*
		 * Task 1:
		 * Print all numbers from 50-20
		 */
		
		int num1=20;
		
		while(num1<=50) {
			System.out.println(num1+" ");
			num1++;
		}
			
		System.out.println("************ Task 2 *********************");
		/*
		 * Task 2:
		 * Print all even numbers from 1-20
		 */
		
		int num2=1;
		
		while(num2 <= 20) {
			
			if(num2%2==0) {
				System.out.println(num2+" ");
			}
			num2++;
		}
		System.out.println("********** Task 2 Shorter way ***************");
		// print all even numbers from 1 to 20
        int c = 2;

        while (c <= 20) {
            System.out.print(c + " ");
            c += 2;
        }
	}

}
