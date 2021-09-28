package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BestTimeBuySellStock Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 27, 2021</pre> 
* @version 1.0 
*/ 
public class BestTimeBuySellStockTest {

	private BestTimeBuySellStock instance;

	@Before
	public void before() throws Exception {
		instance = new BestTimeBuySellStock();
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: maxProfit(int[] prices)
	*
	*/
	@Test
	public void testMaxProfit() throws Exception {
		int[] prices = new int[] {7,1,5,3,6,4};
		Assert.assertEquals(5, instance.maxProfit(prices));

		prices = new int[] {7,6,4,3,1};
		Assert.assertEquals(0, instance.maxProfit(prices));
	}
} 
