package com.p1;

public class Count {

	public static void main(String[] args) {
		
		System.out.println(m1(152005) );
		
	}
	
	public static int m1(int a) {

		int count=0;
		
		while(a>0) {
			a = a/10;
			count++;
		}
		return count;
	}
}
