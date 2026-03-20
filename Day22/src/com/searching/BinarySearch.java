package com.searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int target =3;
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid= start + (end - start)/2;
			
			if(arr[mid]>target) {
				end = mid-1;
			}else if(arr[mid]<target) {
				start= mid+1;
			}else {
				System.out.println("Element found at index: " + mid);				
				return;
			} 
		}
		System.out.println(-1);
	}  
} 
