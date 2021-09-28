package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ValidPalindrome Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 27, 2021</pre> 
* @version 1.0 
*/ 
public class ValidPalindromeTest {
	private ValidPalindrome instance;

	@Before
	public void before() throws Exception {
		instance = new ValidPalindrome();
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: isPalindrome(String s)
	*
	*/
	@Test
	public void testIsPalindrome() throws Exception {
		Assert.assertTrue(instance.isPalindrome("A man, a plan, a canal: Panama"));
		Assert.assertFalse(instance.isPalindrome("race a car"));
		Assert.assertFalse(instance.isPalindrome("0P"));
	}
} 
