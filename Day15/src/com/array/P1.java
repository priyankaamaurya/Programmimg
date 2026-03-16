package com.array;

public class P1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		System.out.println("Traverse the number");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("reverse the number");
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}

	}
	
	
}
