package com.array;

public class ReverseString {

	public static void main(String[] args) {
		
		String  arr[] = {"Pineapple", "Strawberry", "Blueberry", "Grapes", "Guava"};
		int i=0;
		int j= arr.length-1;
		
		while(i<j) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		} 
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}	
}
