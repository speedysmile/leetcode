package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LongestTurbulentSubarray Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 21, 2021</pre> 
* @version 1.0 
*/ 
public class LongestTurbulentSubarrayTest {

	private LongestTurbulentSubarray instance;

	@Before
	public void before() throws Exception {
		instance = new LongestTurbulentSubarray();
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: maxTurbulenceSize(int[] arr)
	*
	*/
	@Test
	public void testMaxTurbulenceSize() throws Exception {
		int[] arr = new int[] {9,4,2,10,7,8,8,1,9};
		int expected = 5;
		Assert.assertEquals(expected, instance.maxTurbulenceSize(arr));

		arr = new int[] {4,8,12,16};
		expected = 2;
		Assert.assertEquals(expected, instance.maxTurbulenceSize(arr));

		arr = new int[] {100};
		expected = 1;
		Assert.assertEquals(expected, instance.maxTurbulenceSize(arr));

		arr = new int[] {9,9};
		expected = 1;
		Assert.assertEquals(expected, instance.maxTurbulenceSize(arr));

		arr = new int[] {0,1,1,0,1,0,1,1,0,0};
		expected = 5;
		Assert.assertEquals(expected, instance.maxTurbulenceSize(arr));
	}
} 
