package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.HashMap;
import java.util.Map;

/** 
* LengthofLastWord Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 21, 2021</pre> 
* @version 1.0 
*/ 
public class LengthofLastWordTest {
	private LengthofLastWord instance;
	private Map<String, Integer> resultMap = new HashMap<>();

	@Before
	public void before() throws Exception {
		instance = new LengthofLastWord();

		resultMap.put("Hello World", 5);
		resultMap.put("   fly me   to   the moon  ", 4);
		resultMap.put("luffy is still joyboy", 6);
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: lengthOfLastWord(String s)
	*
	*/
	@Test
	public void testLengthOfLastWord() throws Exception {
		for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
			Assert.assertEquals(entry.getValue().intValue(), instance.lengthOfLastWord(entry.getKey()));
		}
	}
} 
