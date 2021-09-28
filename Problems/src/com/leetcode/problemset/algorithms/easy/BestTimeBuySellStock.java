package com.leetcode.problemset.algorithms.easy;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *
 */
public class BestTimeBuySellStock {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int min = prices[0];
		int max = 0;
		for (int price : prices) {
			if (price >= min) {
				max = Math.max(price - min, max);
			} else {
				min = price;
			}
		}
		return max;
	}
}
