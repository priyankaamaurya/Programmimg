package com.pattern;

public class P17 {

	public static void main(String[] args) {
		
		int x =1;
		for(int i=1; i<=5; i++ ) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" " + " ");
				} 
			for(int k=1; k<=(2 * i - 1); k++) {
				System.out.print(x + " ");
				x++;
				}			
			System.out.println();			
		}
	}
}
