package com.quest.all;

/*
Problem : Find max profit that can be achieved
Given : stock rates
We can make only one transaction
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] dayTrade = new int[]{100, 80, 120, 130, 70, 60, 100, 125};

        var currentMinTrade = dayTrade[0];// to track min trade so far
        var maxProfit = Integer.MIN_VALUE;
        for (int currentTrade : dayTrade) {

//           Find min so far
            currentMinTrade = Math.min(currentMinTrade, currentTrade);

//            max profit so far
            var currentDiff = currentTrade - currentMinTrade;

//            updating max profit f
            maxProfit = Math.max(maxProfit, currentDiff);

        }
        System.out.println(" Maximum profit with one transaction " + maxProfit);
    }
}
