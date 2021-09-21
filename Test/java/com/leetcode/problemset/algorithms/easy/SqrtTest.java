package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Sqrt Tester. 
* 
* @author <Authors name> 
* @since <pre>9�� 21, 2021</pre> 
* @version 1.0 
*/ 
public class SqrtTest {
	private Sqrt instance;

	@Before
	public void before() throws Exception {
		instance = new Sqrt();
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: mySqrt(int x)
	*
	*/
	@Test
	public void testMySqrt() throws Exception {
		Assert.assertEquals(2, instance.mySqrt(4));
		Assert.assertEquals(2, instance.mySqrt(8));
		Assert.assertEquals(26, instance.mySqrt(721));
		Assert.assertEquals(10, instance.mySqrt(101));
		Assert.assertEquals(31, instance.mySqrt(1000));
		Assert.assertEquals(100, instance.mySqrt(10001));
		Assert.assertEquals(316, instance.mySqrt(100000));
		Assert.assertEquals(1000, instance.mySqrt(1000000));
		Assert.assertEquals(3162, instance.mySqrt(10000000));
		Assert.assertEquals(46339, instance.mySqrt(2147395599));
	}
} 
