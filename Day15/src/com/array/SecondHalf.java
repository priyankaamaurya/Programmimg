package com.array;

public class SecondHalf {
	
	static void printSecondHalf(int arr[]) {
        int n = arr.length;

        for (int i = n / 2; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        printSecondHalf(arr); // calling method
    }

}
