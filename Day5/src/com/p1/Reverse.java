package com.p1;

public class Reverse {

	public static void main(String[] args) {
		
		int n = 123;
		int rev =0;
		int digit=0;
		
		while(n>0) {
			digit=n%10;
			rev = rev*10+digit;
			n= n/10;
		}
		
		System.out.println(rev);
		
	} 
	
}
