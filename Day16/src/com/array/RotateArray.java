package com.array;

public class RotateArray {

	public static void main(String[] args) {
		
		int k=2;
		int[] arr = {1,2,3,4,5,6,7,8};
		
		for(int j=0; j<2; j++) {
		int temp = arr[0];
		
			for(int i=0; i<arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr[arr.length-1]=temp;
		
			for(int i : arr) {
				System.out.println(i + " ");
			}
		}
	}
}
