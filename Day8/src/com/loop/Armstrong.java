package com.loop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int original = num;
		int temp = num;
		int digits = 0;
		int sum = 0;
		
//		Step 1 : Count number of digits 
		while (temp !=0) {
			digits++;
			temp = temp / 10;			
		}
		
//		Step 2: Calculate Armstrong sum
		temp = num;
		while (temp !=0) {
			int rem = temp % 10;
			
//		manual power calculation
			int power = 1;
			for (int i = 1; i <= digits; i++) {
				power = power * rem;
			}
			
			sum = sum + power;
			temp = temp / 10;
		}
		
//		Step 3: Check Armstrong
		if (sum == original) {
			System.out.println(original + " is an Armstrong number");
		} else {
			System.out.println(original + " is not an Armstrong number");
		}
		
		sc.close();
	}
}

//Time Complexity --> Big O(n) 
//Space Complexity --> Big O(1)

