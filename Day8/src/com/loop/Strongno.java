package com.loop;

public class Strongno {

	public static void main(String[] args) {
		
		int n =145;
		int n1=n;
		int sum =0;
		
		while(n>0) {
			int digit = n%10;
			int fact = 1;
		
			for(int i=1; i<=digit; i++) {
				fact = fact * i;
			}
			sum += fact;
			n=n/10;
		} 
		
		if(n1 == sum) {
			System.out.println("Strong no");
		}else {
			System.out.println("Not a strong no");
		}
	}
}


// logic of strong no is

// find digit
// digit find factorial
// sum
// sum == number

//Time Complexity --> Big O(n) 
//Space Complexity --> Big O(1)


// armstrong no 153, 13
// find exponential of given no without using in built function  2^3, 4^3

