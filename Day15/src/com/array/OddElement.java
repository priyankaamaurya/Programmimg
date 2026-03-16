package com.array;

public class OddElement {

	static void odd (int []arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]); 
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,2,3,44,5,6,9,11};
		
		odd(arr);
	}
}
