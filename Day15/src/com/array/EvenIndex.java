package com.array;

public class EvenIndex {

	static void even (int []arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.println(i); 
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		even(arr);
	}
}
