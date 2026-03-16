package com.array;

public class Reverse1stHalf {
 
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int k=3;
		int temp;
		
		int i=0;
		int j=k-1;
		
		while (i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		for (int x=0; x<arr.length; x++) {
			System.out.println(arr[x] + " ");
		}
		
	}
}
