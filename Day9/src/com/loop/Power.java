package com.loop;

public class Power {

	public static void main(String[] args) {
		
		int base= 3;
		int power = 4;
		int pow =1;
			
			for (int i =1; i<=power; i++) {
				pow=pow*base;
			}
			System.out.println(pow);
		}
	
}

//Time Complexity --> Big O(n pow 2) 
//Space Complexity --> Big O(1)
