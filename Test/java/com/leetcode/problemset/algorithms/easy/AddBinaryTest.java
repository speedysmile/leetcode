package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* AddBinary Tester. 
* 
* @author <Authors name> 
* @since <pre>9�� 21, 2021</pre> 
* @version 1.0 
*/ 
public class AddBinaryTest {

	private AddBinary instance;

	private String[] arrA;

	private String[] arrB;

	private String[] arrR;

	@Before
	public void before() throws Exception {
		instance = new AddBinary();
		arrA = new String[] {"11", "1010", "1111"};
		arrB = new String[] {"1", "1011", "1111"};
		arrR = new String[] {"100", "10101", "11110"};
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: addBinary(String a, String b)
	*
	*/
	@Test
	public void testAddBinary() throws Exception {
		for(int i = 0; i < arrA.length; i++) {
			Assert.assertEquals(arrR[i], instance.addBinary(arrA[i], arrB[i]));
		}
	}
} 
