package com.pattern;

public class P15 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				if((i+j)%2==0) {
					System.out.print('X' + " ");
				}
				else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
}
