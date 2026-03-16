package com.p1;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 12321;
		int rev=0;
		int digit = 0;
		int n1=num;
		
		while (num>0) {
			digit =num%10;
			rev = rev * 10 + digit;
			num = num/10;
		}
		System.out.println(rev);
		 
		if(n1==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
			
	}
}

//sum of all digit 
//
//while (num>0) {
//	int digit = num%10;
//	sum = sum +digit;
//	num/=10;
//}

//product of the even digit 



















