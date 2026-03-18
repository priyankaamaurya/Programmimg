package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a= {1,3,5,8,9,0,0,5,2};
		
		for(int i=0; i<a.length-1; i++) {
			int min=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
			print(a);
		}
	}
	
	public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
