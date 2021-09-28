package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BreakPalindrome Tester. 
* 
* @author <Authors name> 
* @since <pre>9�� 25, 2021</pre> 
* @version 1.0 
*/ 
public class BreakPalindromeTest {

	private BreakPalindrome instance;

	@Before
	public void before() throws Exception {
		instance = new BreakPalindrome();
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: breakPalindrome(String palindrome)
	*
	*/
	@Test
	public void testBreakPalindrome() throws Exception {
		Assert.assertEquals("aaccba", instance.breakPalindrome("abccba"));
		Assert.assertEquals("", instance.breakPalindrome("a"));
		Assert.assertEquals("ab", instance.breakPalindrome("aa"));
		Assert.assertEquals("abb", instance.breakPalindrome("aba"));
	}
} 
