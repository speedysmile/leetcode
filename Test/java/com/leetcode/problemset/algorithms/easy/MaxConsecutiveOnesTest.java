package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* MaxConsecutiveOnes Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 21, 2021</pre> 
* @version 1.0 
*/ 
public class MaxConsecutiveOnesTest {
	private MaxConsecutiveOnes instance;

	@Before
	public void before() throws Exception {
		instance = new MaxConsecutiveOnes();
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: findMaxConsecutiveOnes(int[] nums)
	*
	*/
	@Test
	public void testFindMaxConsecutiveOnes() throws Exception {
		int[] nums = new int[] {1,1,0,1,1,1};
		int expected = 3;
		Assert.assertEquals(expected, instance.findMaxConsecutiveOnes(nums));

		nums = new int[] {1,0,1,1,0,1};
		expected = 2;
		Assert.assertEquals(expected, instance.findMaxConsecutiveOnes(nums));
	}

} 
