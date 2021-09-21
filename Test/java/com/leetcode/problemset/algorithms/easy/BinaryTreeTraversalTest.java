package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** 
* BinaryTreeTraversal Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 21, 2021</pre> 
* @version 1.0 
*/ 
public class BinaryTreeTraversalTest {

	private List<List<Integer>> inorderTree;

	private List<List<Integer>> inorderResult;

	private BinaryTreeTraversal instance;

	@Before
	public void before() throws Exception {
		instance = new BinaryTreeTraversal();
		initInorder();
	}

	private void initInorder() {
		inorderTree = new ArrayList<>();
		inorderTree.add(Arrays.asList(1,null,2,3));
		inorderTree.add(Collections.emptyList());
		inorderTree.add(Collections.singletonList(1));
		inorderTree.add(Arrays.asList(1,2));
		inorderTree.add(Arrays.asList(1,null,2));

		inorderResult = new ArrayList<>();
		inorderResult.add(Arrays.asList(1,3,2));
		inorderResult.add(Collections.emptyList());
		inorderResult.add(Collections.singletonList(1));
		inorderResult.add(Arrays.asList(2,1));
		inorderResult.add(Arrays.asList(1,2));
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: inorderTraversal(TreeNode root)
	*
	*/
	@Test
	public void testInorderTraversal() throws Exception {
		int len = inorderTree.size();
		for (int i = 0; i < len; i++) {
			TreeNode tree = TreeNode.buildTreeNode(inorderTree.get(i).toArray(new Integer[0]));
			List<Integer> result = instance.inorderTraversal(tree);
			Assert.assertArrayEquals(inorderResult.get(i).toArray(), result.toArray());
		}
	}


	/**
	*
	* Method: inorderByRecurrence(TreeNode root, List<Integer> result)
	*
	*/
	@Test
	public void testInorderByRecurrence() throws Exception {
		int len = inorderTree.size();
		for (int i = 0; i < len; i++) {
			List<Integer> result = new ArrayList<>();
			TreeNode tree = TreeNode.buildTreeNode(inorderTree.get(i).toArray(new Integer[0]));
			instance.inorderByRecurrence(tree, result);
			Assert.assertArrayEquals(inorderResult.get(i).toArray(), result.toArray());
		}
	}

	/**
	*
	* Method: inorderByForeach(TreeNode root, List<Integer> result)
	*
	*/
	@Test
	public void testInorderByForeach() throws Exception {
		int len = inorderTree.size();
		for (int i = 0; i < len; i++) {
			List<Integer> result = new ArrayList<>();
			TreeNode tree = TreeNode.buildTreeNode(inorderTree.get(i).toArray(new Integer[0]));
			TreeNode.printTree(tree);
			System.out.println();
			instance.inorderByForeach(tree, result);
			Assert.assertArrayEquals(inorderResult.get(i).toArray(), result.toArray());
		}
	}

} 
