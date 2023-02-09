package com.company;

public class BuySellStock {

    int profit = 0;
    int max = 0;
    int subtract = 0;
    int min = Integer.MAX_VALUE;
    public int maxProfit(int[] prices) {

        for(int i = 0; i < prices.length - 1; i++) {

            if(prices[i] < min) {
                min = prices[i];
            }

            subtract = prices[i+1] - min;

            if(subtract > 0) {
                profit += subtract;
                min = prices[i+1];
                System.out.println(profit);
            }
        }

        return profit;

    }
}
