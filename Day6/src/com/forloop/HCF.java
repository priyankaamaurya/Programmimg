package com.forloop;

public class HCF {

	public static void main(String[] args) {
		
		int n = 15;
		int m = 17;
		int hcf = 1;
		
		for(int i=1; i<=n && i <=m; i++) {
			
			if(n % i ==0 && m % i == 0 ) {
				hcf = i;
			}
		}
		System.out.println("HCF is : " + hcf);
	}
}

//Time Complexity --> Big O(n)
//Space Complexity --> Big O(1)