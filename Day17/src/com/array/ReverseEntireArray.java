package com.array;

public class ReverseEntireArray {

	public static void main(String[] args) {
		
		int arr[] = {1,3,6,7,4,4,7,8,5};
		int k=0;
		int temp;
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		for(int x=0; x < arr.length; x++) {
			System.out.println(arr[x] + " ");
		}
	}
}
