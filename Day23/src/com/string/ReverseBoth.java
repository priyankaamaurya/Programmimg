package com.string;

public class ReverseBoth {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		String rev ="";
		String word ="";
		
		for(int i=s.length()-1; i>=0; i-- ) {
			char c=s.charAt(i);
			
			if(c != ' ') {
				word = word +c;
			} else {
				word = word + c;
				rev = word + rev;
				word = "";
			}
		 }
		
			word = word + " ";
			rev = word + rev;

		System.out.println(rev);
		
	}
}
