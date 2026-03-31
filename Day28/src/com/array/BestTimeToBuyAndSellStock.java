package com.array;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int buy = prices[0];   // minimum price so far
        int profit = 0;        // maximum profit

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < buy) {
                buy = prices[i];   // update buying price
            } else {
                int currentProfit = prices[i] - buy;
                profit = Math.max(profit, currentProfit);
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }
}
