package com.searching;

public class CountOfPosNeg {

	public static void main(String[] args) {
		
		int[] arr = {1,43,554,75,434,5676,4,323,345, -8, -5, -34, -871, -9};
		
		int pos =0 ;
		int neg = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				pos++;
			} else if(arr[i]<0) {
				neg++;
			}
		}
		
		System.out.println("Count of positive num is " + pos + " and negative num is " + neg );
	}
}
