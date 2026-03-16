package com.pattern;

public class P1 {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" " );
			}
			if(i%2==0) {
				for(int k=i; k>=1; k--) {
					System.out.print(k+ " ");
				}
			}
			else {
				for(int k=1; k<=i; k++) {
					System.out.print(k + " ");
				}
			}
			
			
			System.out.println();
		}
	}
}
