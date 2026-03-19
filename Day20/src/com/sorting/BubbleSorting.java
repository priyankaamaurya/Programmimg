package com.sorting;

public class BubbleSorting {

    public static void main(String[] args) {
        
        int[] arr = {6,3,0,1,2,3,0,4};
        
        for(int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // flag
            
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // swap happened
                }
            }
            
            if(swapped) {
                print(arr);
            } else {
                break;
            }
        }
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}