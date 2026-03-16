package com.array;

public class Search {

public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		System.out.println("Search the number");
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==3) {
				System.out.println(i);
				
			}else {
				System.out.println("-1");
			}
		} 
	}
}
