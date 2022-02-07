package com.java.algorithm.array;

/**
 * @author: Trae.Liu
 * @create: 2022-02-07 17:26
 * @description: 买卖股票的最大利润
 */
public class MaxProfit {

    public static int maxProfit(int[] price) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            } else if (price[i] - minPrice > maxProfit) {
                maxProfit = price[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }

}
