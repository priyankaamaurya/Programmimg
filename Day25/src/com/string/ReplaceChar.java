package com.string;

public class ReplaceChar {
	
	public static void main(String[] args) {
		
		String s = "anagram";
		String res = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch =='a') {
				res = res + 'z';
			} else {
				res = res +ch;
			}
		}
		System.out.println(res);
	}
}
