package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.*;

/** 
* MaximumLengthWithUniqueCharacters Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 25, 2021</pre> 
* @version 1.0 
*/ 
public class MaximumLengthWithUniqueCharactersTest {

	private MaximumLengthWithUniqueCharacters instance;

	private Map<Integer, List<String>> testMap;

	@Before
	public void before() throws Exception {
		instance = new MaximumLengthWithUniqueCharacters();

		testMap = new HashMap<Integer, List<String>>() {
			{
				put(4, Arrays.asList("un","iq","ue"));
				put(6, Arrays.asList("cha","r","act","ers"));
				put(16, Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"));
				put(26, Collections.singletonList("abcdefghijklmnopqrstuvwxyz"));
			}
		};
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: maxLength(List<String> arr)
	*
	*/
	@Test
	public void testMaxLength() throws Exception {
		for (Map.Entry<Integer, List<String>> entry : testMap.entrySet()) {
			int res = instance.maxLength(entry.getValue());
			System.out.println("input : arr = " + entry.getValue());
			System.out.println("Output : " + res);
			Assert.assertEquals(entry.getKey().intValue(), res);
		}
	}
} 
