package day9;

public class BuySellStock {
	
	public static int maxProfit(int[] prices) {
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price : prices) {
			
			// update minimum price
			if (price < minPrice) {
				minPrice = price;
			}
			
			// calculate profit
			int profit = price - minPrice;
			
            // update maximum profit
			if(profit > maxProfit) {
				maxProfit = profit; 
			}
		}
		
		return maxProfit;
	} 
	
	public static void main(String[] args) {
		
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println("Max profits: " + maxProfit(prices));
		
	}

}
