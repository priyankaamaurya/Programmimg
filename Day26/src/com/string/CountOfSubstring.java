package com.string;

public class CountOfSubstring {
	
	public static void main(String[] args) {
	
		String s= "hello java";
		int count =0;
		
		for(int j=0; j<s.length(); j++) {
			for(int k=j; k<s.length(); k++) {
				count++; 
			}
		}
		System.out.println(count);

	}
}
