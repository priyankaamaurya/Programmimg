package com.array;

public class Reverse2ndHalf {

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,10,12,14};
		int k=3;
		int temp;
		
		int i=k;
		int j=arr.length-1;
		
		while(i<j) {
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
