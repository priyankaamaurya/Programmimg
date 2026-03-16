package com.forloop;

public class Factor {

	public static void main(String[] args) {
		 
		int n=24;
		int count=0;
		int count1=0;
		
		for(int i=1; i<=n; i++) {
			
			
			if (n%i==0) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("Count of Factors is : " + count);
		
		
		
		//Time Complexity --> Big O(n)
		//Space Complexity --> Big O(1)
		
		
		//code optimization
		for(int i=1; i<=n/2; i++) {
			
			if (n%i==0) {
				System.out.println(i);
				count1++;
			}
			
		}
		System.out.println("Count of Factors is : " + count1);
		
		//Time Complexity --> Big O(log n/2)
	}
}



//Time Complexity --> Big O(log n/2)
