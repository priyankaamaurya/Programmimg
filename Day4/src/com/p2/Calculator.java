package com.p2;

public class Calculator {

	public static void main(String[] args) {
		
		char c = '*';
		int n1 = 15;
		int n2 = 17;
		
		int res=0;
		
		switch (c) {
		case '+':
			res = add(n1, n2);
			break;
			
		case '-':
			res = sub(n1, n2);
			break;
			
		case '*':
			res = mul(n1, n2);
			break;
			
		case '/':
			res = div(n1, n2);
			break;
			
		case '%':
			res = mod(n1, n2);
			break;

		default:
			System.out.println("Invalid operator");
			break;
		}
		
		System.out.println("Result :" + res);
	}
	
	public static int add( int n1, int n2) {
		return n1+n2;
	}
	
	public static int sub( int n1, int n2) {
		return n1-n2;
	}
	
	public static int mul( int n1, int n2) {
		return n1*n2;
	}
	
	public static int div( int n1, int n2) {
		return n1/n2;
	}
	
	public static int mod( int n1, int n2) {
		return n1%n2;
	}
	
}
