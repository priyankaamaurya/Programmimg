package com.array;

public class MaxSubArray {

	public static void main(String[] args) {
		
		int [] a = {-1,0,2,-2,3,-4,5,6,-7,-1,0,1,2};
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			int sum =0;
			
			for(int j=i; j<a.length; j++) {
				sum += a[j];
				
				
				if(sum>max) {
					max=sum;
				}				
			}
		}
		System.out.println(max);
 	}
}
