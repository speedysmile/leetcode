package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.HashMap;
import java.util.Map;

/** 
* MaximumSubarray Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 21, 2021</pre> 
* @version 1.0 
*/ 
public class MaximumSubarrayTest { 

	private static final Map<Integer, int[]>  testMap = new HashMap<>();

	private MaximumSubarray instance;

	@Before
	public void before() throws Exception {
		testMap.put(6, new int[] {-2,1,-3,4,-1,2,1,-5,4});
		testMap.put(1, new int[] {1});
		testMap.put(23, new int[] {5,4,-1,7,8});
		instance = new MaximumSubarray();
	}

	@After
	public void after() throws Exception {

	}

	/**
	*
	* Method: maxSubArray(int[] nums)
	*
	*/
	@Test
	public void testMaxSubArray() throws Exception {
		for (Map.Entry<Integer, int[]> entry : testMap.entrySet()) {
			Assert.assertEquals(entry.getKey().intValue(), instance.maxSubArray(entry.getValue()));
		}
	}
} 
