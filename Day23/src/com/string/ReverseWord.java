package com.string;

public class ReverseWord {
	
	public static void main(String[] args) {
		
		String s = "Sky is blue";
		String rev = "";
		String word = "";
		
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch != ' ') {
				word = word +ch;
			} else {
				word = word + ch;
				rev = word + rev;
				word = "";
			}
		}
		
		word = word + " ";
		rev = word + rev;

		System.out.println(rev);
	}
}
