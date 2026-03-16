package com.forloop;

public class FactorSeries {

	public static void main(String[] args) {
		
		int start = 10;
		int end = 20;
		
		for(int j=start; j<=end; j++) {
			
			int n=j;
			int count=0;
			
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(n);
			}
		}
	}
}

//Time Complexity --> Big O(n2)
//Space Complexity --> Big O(1)