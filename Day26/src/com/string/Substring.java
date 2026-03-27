package com.string;

public class Substring {
	
	public static void main(String[] args) {
		
		String s ="Hello World";
		
		for(int j=0; j<s.length(); j++) {
			String word = "";

			for(int k=j; k<s.length(); k++) {
				 word = word + s.charAt(k);
					System.out.println(word);

			}
		}
		
		//** 3 loop approach
		
//		for(int i=0; i<s.length();i++) {
//			for(int j=0; j<s.length();j++) {
//				for(int k=i; k<=j; k++) {
//					 System.out.print(s.charAt(k));
//				}
//				System.out.println();
//			}
//		}
	}

}
