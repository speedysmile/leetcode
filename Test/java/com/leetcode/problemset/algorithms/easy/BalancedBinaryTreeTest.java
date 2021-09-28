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
* BalancedBinaryTree Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 25, 2021</pre> 
* @version 1.0 
*/ 
public class BalancedBinaryTreeTest {

	private BalancedBinaryTree instance;

	private List<Integer[]> trees;

	private boolean[] bools;

	@Before
	public void before() throws Exception {
		instance = new BalancedBinaryTree();

		trees = new ArrayList<>();
		trees.add(new Integer[] {3,9,20,null,null,15,7});
		trees.add(new Integer[] {1,2,2,3,3,null,null,4,4});

		bools = new boolean[] {true, false};
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: isBalanced(TreeNode root)
	*
	*/
	@Test
	public void testIsBalanced() throws Exception {
		for (int i = 0; i < trees.size(); i++) {
			boolean res = instance.isBalanced(TreeNode.buildTreeNode(trees.get(i)));
			System.out.println("input: root = " + Arrays.toString(trees.get(0)));
			System.out.println("Output: " + res);
			Assert.assertEquals(bools[i], res);
		}
	}
} 
