package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* NthTribonacciNumber Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 25, 2021</pre> 
* @version 1.0 
*/ 
public class NthTribonacciNumberTest {

	private NthTribonacciNumber instance;

	@Before
	public void before() throws Exception {
		instance = new NthTribonacciNumber();
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: tribonacci(int n)
	*
	*/
	@Test
	public void testTribonacci() throws Exception {
		Assert.assertEquals(0, instance.tribonacci(0));
		Assert.assertEquals(4, instance.tribonacci(4));
		Assert.assertEquals(1389537, instance.tribonacci(25));
		Assert.assertEquals(2082876103, instance.tribonacci(37));
	}

} 
