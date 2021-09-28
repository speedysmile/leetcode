package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* MinimumDepthBinaryTree Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 26, 2021</pre> 
* @version 1.0 
*/ 
public class MinimumDepthBinaryTreeTest {

	private MinimumDepthBinaryTree instance;

	@Before
	public void before() throws Exception {
		instance = new MinimumDepthBinaryTree();
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: minDepth(TreeNode root)
	*
	*/
	@Test
	public void testMinDepth() throws Exception {
		Assert.assertEquals(2, instance.minDepth(TreeNode.buildTreeNode(new Integer[] {3,9,20,null,null,15,7})));
		Assert.assertEquals(5, instance.minDepth(TreeNode.buildTreeNode(new Integer[] {2,null,3,null,4,null,5,null,6})));
	}

	/**
	 *
	 * Method: minDepth(TreeNode root)
	 *
	 */
	@Test
	public void testMinDepth1() throws Exception {
		Assert.assertEquals(2, instance.minDepth1(TreeNode.buildTreeNode(new Integer[] {3,9,20,null,null,15,7})));
		Assert.assertEquals(5, instance.minDepth1(TreeNode.buildTreeNode(new Integer[] {2,null,3,null,4,null,5,null,6})));
	}
} 
