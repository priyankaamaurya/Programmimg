package com.pattern;

public class P4 {

	public static void main(String[] args) {
		
		int n=5;
		int x=1;
		
		int[][] arr = new int[n][n];
		
		for(int j=0; j<n; j++) {
			for(int i=j; i<n; i++) {
				arr[i][j] = x++;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println(); 
		}
	}
}
