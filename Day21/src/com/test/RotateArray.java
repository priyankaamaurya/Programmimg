package com.test;

public class RotateArray {

	public static void main(String[] args) {
		
		int k=2;
		int[] arr = {1,2,3,4,5,6,7,8};
		
		for(int i=0; i<2; i++) {
		int temp = arr[0];
		
			for(int j=0; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1]=temp;
		
			System.out.println("Rotate array");

			for(int j : arr) {
				System.out.println(j + " ");
			}
		}
	}
}
