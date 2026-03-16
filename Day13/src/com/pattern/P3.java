package com.pattern;

public class P3 {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*" + " ");
			}			
	
			for(int k=1; k<=2*(n-i)-1; k++) {
				System.out.print(" " + " ");
			}
			 
			for(int j=1; j<=i; j++) {
				if(j<n)
					System.out.print("*"+ " ");
			}
			
			System.out.println(" ");	 
		}
	}
}
