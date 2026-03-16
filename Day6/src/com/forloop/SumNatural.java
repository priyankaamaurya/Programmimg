package com.forloop;

public class SumNatural {

	public static void main(String[] args) {
		
		int n = 6;
		int sum=0;
		for(int i=1; i<=n; i++ ) {
			sum= sum+i;
			System.out.println(sum);
		}
	}
}

// Time complexity --> Big O(n)
// Space complexity --> Big O(1)