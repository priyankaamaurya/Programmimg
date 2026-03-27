package com.string;

public class LowerCase {
	
	public static void main(String[] args) {
		
		String s = "ProgrAMMING";
		String res ="";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				ch = (char) (ch+32);
			}
			
			res = res+ch;
		}
		System.out.println(res);
	}

}
