package com.p1;

public class P2 {

	public static void main(String[] args) {
		
		int units=315;
		int total_price = 0;
		int total_amount=0;
		
		if(units>=0 && units <=100) {
			total_price = bill1(units);
		}
		else if(units>100 && units<=300) {
			total_price= bill2(units);
		}
		else if(units>300) {
			total_price= bill3(units);
		}
		
		
		if(total_price > 2000) {
			total_amount = surcharge(total_price);
		}
		else if(total_price < 2000) {
			total_amount = nosurcharge(total_price);
		}
		
		System.out.println("Final Electricity Bill Amount : " + total_amount);

	}
	
	
    public static int bill1(int units) {
    	return units*2;
    }
    
    public static int bill2(int units) {
    	return units*4;
    }
    
    public static int bill3(int units) {
    	return units*6;
    }
    
    public static int surcharge(int total_price) {
    	return total_price + (total_price*(10/100));
    } 
    
    public static int nosurcharge(int total_price) {
    	return total_price ;
    } 
    

}


