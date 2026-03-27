package com.string;

public class SeparateStringWithSpace {

	public static void main(String[] args) {
		
		String s = "Hello World Java";
		String word ="";
		
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);
			 
			if(ch !=' ') {
				word = word +ch;
			} else {
				System.out.println(word);
				word="";
			}
		}
		System.out.println(word);
	}
}
