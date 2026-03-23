package com.sorting;

public class Sort {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,50,90,60,80,40,30};
		
		for(int i=1; i<arr.length;i++) {
			
			int temp = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		System.out.println("Sorted Array : ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
	}

}
