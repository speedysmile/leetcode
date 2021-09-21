package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.HashMap;
import java.util.Map;

/** 
* PlusOne Tester. 
* 
* @author <Authors name> 
* @since <pre>9�� 21, 2021</pre> 
* @version 1.0 
*/ 
public class PlusOneTest {

	private PlusOne instance;
	private Map<int[], int[]> resultMap = new HashMap<>();

	@Before
	public void before() throws Exception {
		instance = new PlusOne();

		resultMap.put(new int[]{1,2,3}, new int[]{1,2,4});
		resultMap.put(new int[]{4,3,2,1}, new int[]{4,3,2,2});
		resultMap.put(new int[]{0}, new int[]{1});
		resultMap.put(new int[]{9}, new int[]{1,0});
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: plusOne(int[] digits)
	*
	*/
	@Test
	public void testPlusOne() throws Exception {
		for (Map.Entry<int[], int[]> entry : resultMap.entrySet()) {
			Assert.assertArrayEquals(entry.getValue(), instance.plusOne(entry.getKey()));
		}
	}
} 
