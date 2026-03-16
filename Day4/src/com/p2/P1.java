package com.p2;

public class P1 {

	public static void main(String[] args) {
		
		String day ="Wednesday";
		
		switch (day){
		
		case "Monday" : {
			System.out.println("Basketball");
			break;
		}
		
		case "Tuesday" : {
			System.out.println("Tennis");
			break;
		}
		
		case "Wednesday" : {
			System.out.println("Cricket");
			break;
		}
		
		case "Thursday" : {
			System.out.println("Volleyball");
			break;
		}
		
		case "Friday" : {
			System.out.println("Football");
			break;
		}
		
		case "Saturday" : {
			System.out.println("Exercise");
			break;
		}
		
		case "Sunday" : {
			System.out.println("Holiday");
			break;
		}
			
		default : {
			System.out.println("Invalid day");
			break;
		}
			
		}
		
	}
}
