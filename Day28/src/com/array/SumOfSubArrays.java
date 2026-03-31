package com.array;

public class SumOfSubArrays {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		
		for(int i=0; i<a.length; i++) {
			String arr = "";
			int sum = 0;
			for(int j=i; j<a.length; j++) {
				arr= arr + a[j] + "";
				sum += a[j];
				System.out.println(sum);
			}
		}
		
	}
}
