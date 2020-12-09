package com.rajiv.maxProfit2;

public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;

        int totalProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            }

            if(prices[i] > minValue){
                totalProfit += prices[i] - minValue;
                minValue = prices[i];
            }
        }

        return totalProfit;
    }
}
