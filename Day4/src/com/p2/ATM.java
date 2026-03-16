package com.p2;

public class ATM {

	public static void main(String[] args) {
		
		int n = 4;
		
		switch (n) {
		
		case 1 : 
			System.out.println("Check Balance");
			break;
		
		case 2 : 
			System.out.println("Withdraw");
			break;
		
		case 3: 
			System.out.println("Deposit");
			break;
		
		case 4 : 
			System.out.println("Mini Statement");
			break;
		
		case 5 : 
			System.out.println("Exit");
			break;
		
		default : 
			System.out.println("Invalid Option");
			break;
		
		}
	}
}
