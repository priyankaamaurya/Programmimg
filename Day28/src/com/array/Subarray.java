package com.array;

public class Subarray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		
		for(int i=0; i<a.length; i++) {
			String arr = "";
			
			for(int j=i; j<a.length; j++) {
				arr = arr + a[j] + "";
				System.out.println(arr);
				
			}
		}
	}
}
