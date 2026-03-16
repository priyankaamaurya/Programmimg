package com.pattern;

public class P5 {
	
	public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {

            // Print spaces
            for(int j = 1; j <= i - 1; j++) {
                System.out.print(" "+ " ");
            }

            // Print stars
            for(int k = 1; k <= n - i + 1; k++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
	}
}


