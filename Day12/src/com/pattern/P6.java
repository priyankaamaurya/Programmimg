package com.pattern;

public class P6 {

	public static void main(String[] args) {
		
		int n=1;
		
		for(int i=5; i>=n; i--) {
			for(int j=5; j>=n+i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
