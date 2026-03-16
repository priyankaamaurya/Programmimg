package com.p2;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Bank Application");
		System.out.println("Select 1 for Savings account");
		System.out.println("Select 2 for Current account");
		
		int account_type = scan.nextInt();
		int balance = 5000;
		
		switch (account_type) {
		
		case 1: 
			System.out.println("Select 1 for Deposit");
			System.out.println("Select 2 for Withdraw");
			System.out.println("Select 3 for Check Balance");
			
			int operation = scan.nextInt();
			
			switch (operation) {
			
			case 1 :
				System.out.println("Enter the amount");
				int amount = scan.nextInt();
				balance += amount;
				System.out.println("Deposit Successfully");
				System.out.println("Balance : " + balance);	
				break;
				
			case 2 : 
				System.out.println("Enter the amount");
				int amount1 = scan.nextInt();
				balance -= amount1;
				System.out.println("Withdraw Successfully");
				System.out.println("Balance : " + balance);	
				break;
				
			case 3 :
//				System.out.println(" Click here to Check Balance");
				System.out.println("Balance : " + balance);	
				break;
				
			default : 
				System.out.println("Invalid Option");
				break;
				
			}
			
			break;
			
		case 2: 
			System.out.println("Select 1 for Deposit");
			System.out.println("Select 2 for Withdraw");
			System.out.println("Select 3 for Check Balance");
			
			int operation1 = scan.nextInt();
			
			switch (operation1) {
			
			case 1 :
				System.out.println("Enter the amount");
				int amount = scan.nextInt();
				balance += amount;
				System.out.println("Deposit Successfully");
				System.out.println("Balance : " + balance);	
				break;
				
			case 2 : 
				System.out.println("Enter the amount");
				int amount1 = scan.nextInt();
				balance -= amount1;
				System.out.println("Withdraw Successfully");
				System.out.println("Balance : " + balance);	
				break;
				
			case 3 :
//				System.out.println(" Click here to Check Balance");
				System.out.println("Balance : " + balance);	
				break;
				
			default : 
				System.out.println("Invalid Option");
				break;
				
			}
			
			break;
			
			
			default : 
				System.out.println("Invalid Account Type");
		
		}
	}
}
