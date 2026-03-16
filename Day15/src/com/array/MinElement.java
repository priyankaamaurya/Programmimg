package com.array;

public class MinElement {

    static int minEle(int arr[]) {
        int min = arr[0];  

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;  
    }

    public static void main(String[] args) {

        int arr[] = {25, 10, 45, 5, 30};

        int result = minEle(arr);

        System.out.println("Minimum element is: " + result);
    }

}
