package com.test;

public class SecondMax {

	public static void main(String[] args) {
		
		int[] arr = {3,6,5,7,8,12,19,4};
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i]> secondMax && arr[i]<max) {
				secondMax = arr[i];
			}
		}
		
		if (secondMax == Integer.MIN_VALUE) { 
			System.out.println("No second Maximum element");
		}else {
			System.out.println("Second Maximum: " + secondMax);
		}
	}
}
