package com.array;

public class SecondMax {

	 public static int getSecondLargest(int[] arr) {
	       
	        int max=arr[0]; 
	        int smax=-1;
	        
	        for(int i=0; i<arr.length; i++){
	            if (arr[i]>max){
	            smax=max;
	            max=arr[i];
	            }  
	            else if(arr[i]>smax && arr[i]<max){
	            smax=arr[i];
	            }
	        } 
	         return smax;
	    } 
	 
	 public static void main(String[] args) {
		
		 int arr[] = {1,12,4,6,8,9,10,15,17};
		 
		 System.out.println(getSecondLargest(arr));
		 
	}
}
