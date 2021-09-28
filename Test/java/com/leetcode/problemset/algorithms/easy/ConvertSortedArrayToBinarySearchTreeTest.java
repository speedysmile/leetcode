package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* ConvertSortedArrayToBinarySearchTree Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 25, 2021</pre> 
* @version 1.0 
*/ 
public class ConvertSortedArrayToBinarySearchTreeTest {

	private ConvertSortedArrayToBinarySearchTree instance;

	private Map<int[], List<Integer[]>> result;

	@Before
	public void before() throws Exception {
		instance = new ConvertSortedArrayToBinarySearchTree();

		result = new HashMap<int[], List<Integer[]>>() {
			{
				put(new int[]{-10,-3,0,5,9}, Arrays.asList(new Integer[]{0,-3,9,-10,null,5}, new Integer[]{0,-10,5,null,-3,null,9}));
				put(new int[]{1,3}, Arrays.asList(new Integer[]{1,null,3}, new Integer[]{3,1}));
			}
		};
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: sortedArrayToBST(int[] nums)
	*
	*/
	@Test
	public void testSortedArrayToBST() throws Exception {
		for (Map.Entry<int[], List<Integer[]>> entry : result.entrySet()) {
			Integer[] res = TreeNode.toArray(instance.sortedArrayToBST(entry.getKey()));
			System.out.println("input : " + Arrays.toString(entry.getKey()));
			System.out.println("output : " + Arrays.toString(res));
			boolean flag = entry.getValue().stream().anyMatch(an -> Arrays.equals(res, an));
			Assert.assertTrue(flag);
		}
	}

} 
