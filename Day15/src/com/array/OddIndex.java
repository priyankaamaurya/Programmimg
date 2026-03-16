package com.array;

public class OddIndex {

	static void odd (int []arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(i%2!=0) {
				System.out.println(i); 
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,31,23,14,51,65};
		
		odd(arr);
	}
}
