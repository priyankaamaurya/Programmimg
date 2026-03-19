package com.test;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {2, 6, 8, 3, 9, 4};
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] =temp;
			
			start++;
			end--;
		}
				
		System.out.print("Reversed Array: [");
		
		for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i] + ", ");
		}
		
		System.out.print("]");
	}
}
