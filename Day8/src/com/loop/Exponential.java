package com.loop;

import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter base number: ");
		int base = sc.nextInt();
		
		System.out.println("Enter exponent");
		int exponent = sc.nextInt();
		
		int result = 1;
		
//		Calculate power manually
		for (int i = 1; i <= exponent; i++) {
			result = result * base;
		}
		System.out.println("Result: " + result);

	sc.close();
	
	}
}

//Time Complexity --> Big O(n) 
//Space Complexity --> Big O(1)
