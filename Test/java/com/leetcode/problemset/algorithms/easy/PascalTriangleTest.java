package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** 
* PascalTriangle Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 27, 2021</pre> 
* @version 1.0 
*/ 
public class PascalTriangleTest { 

	private PascalTriangle instance;

	private List<List<Integer>> res;

	@Before
	public void before() throws Exception {
		instance = new PascalTriangle();

		res = new ArrayList<>();
		res.add(Collections.singletonList(1));
		res.add(Arrays.asList(1,1));
		res.add(Arrays.asList(1,2,1));
		res.add(Arrays.asList(1,3,3,1));
		res.add(Arrays.asList(1,4,6,4,1));
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: generate(int numRows)
	*
	*/
	@Test
	public void testGenerate() throws Exception {
		List<List<Integer>> result = instance.generate(5);
		Assert.assertEquals(res, result);

		for (int i = 0; i <= 5; i++) {
			System.out.println(Arrays.toString(instance.getRow(i).toArray()));
		}
	}
} 
