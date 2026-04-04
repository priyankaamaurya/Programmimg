package com.array;

public class LongestSubArrayTargetSum {

	public static void main(String[] args) {
		
		int[] arr = {1, 0 ,1, 2, 1, 0, 1, 1, 0};
        int k = 3;
        int maxLen = 0;

        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];

                if(sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        System.out.println("Longest Length: " + maxLen);    
	    
	}
}
