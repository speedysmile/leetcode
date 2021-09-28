package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
* MaximumDepthOfBinaryTree Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 23, 2021</pre> 
* @version 1.0 
*/ 
public class MaximumDepthOfBinaryTreeTest {

	private MaximumDepthOfBinaryTree instance;

	private List<Integer[]> input;

	private int[] result;

	@Before
	public void before() throws Exception {
		instance = new MaximumDepthOfBinaryTree();

		input = new ArrayList<>();
		input.add(new Integer[] {3,9,20,null,null,15,7});
		input.add(new Integer[] {1,null,2});
		input.add(new Integer[] {});
		input.add(new Integer[] {0});

		result = new int[]{3,2,0,1};
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: maxDepth(TreeNode root)
	*
	*/
	@Test
	public void testMaxDepth() throws Exception {
		for (int i = 0; i < input.size(); i++) {
			System.out.println("input: root = " + Arrays.toString(input.get(0)));
			int deep = instance.maxDepth(TreeNode.buildTreeNode(input.get(i)));
			System.out.println("output: " + deep);
			Assert.assertEquals(result[i], deep);
		}
	}

	/**
	 *
	 * Method: maxDepth1(TreeNode root)
	 *
	 */
	@Test
	public void testMaxDepth1() throws Exception {
		for (int i = 0; i < input.size(); i++) {
			System.out.println("input: root = " + Arrays.toString(input.get(0)));
			int deep = instance.maxDepth1(TreeNode.buildTreeNode(input.get(i)));
			System.out.println("output: " + deep);
			Assert.assertEquals(result[i], deep);
		}
	}
} 
