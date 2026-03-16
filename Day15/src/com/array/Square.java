package com.array;

public class Square {

	 static int[] sqr(int arr[]) {
	        int[] result = new int[arr.length];

	        for(int i = 0; i < arr.length; i++) {
	            result[i] = arr[i] * arr[i];
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        int arr[] = {2, 3, 4, 5};

	        int[] squares = sqr(arr);

	        for(int i = 0; i < squares.length; i++) {
	            System.out.println(squares[i]);
	        }
	    }
}
