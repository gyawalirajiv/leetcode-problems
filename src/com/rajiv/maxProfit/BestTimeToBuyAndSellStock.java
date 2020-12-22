package com.rajiv.maxProfit;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0) return 0;

        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minValue){
                minValue = prices[i];
            }
            if(prices[i] - minValue > maxProfit) maxProfit = prices[i] - minValue;
        }
        return maxProfit;
    }
}
