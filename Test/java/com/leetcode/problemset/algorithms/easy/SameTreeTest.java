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
* SameTree Tester. 
* 
* @author <Authors name> 
* @since <pre>9�� 23, 2021</pre> 
* @version 1.0 
*/ 
public class SameTreeTest {

	private SameTree instance;

	List<Integer[]> p = new ArrayList<>();

	List<Integer[]> q = new ArrayList<>();

	boolean[] bools;

	@Before
	public void before() throws Exception {
		instance = new SameTree();

		p.add(new Integer[] {1,2,3});
		p.add(new Integer[] {1,2});
		p.add(new Integer[] {1,2,1});

		q.add(new Integer[] {1,2,3});
		q.add(new Integer[] {1,null,2});
		q.add(new Integer[] {1,1,2});

		bools = new boolean[] {true, false, false};
	}

	@After
	public void after() throws Exception {

	}

	/**
	*
	* Method: isSameTree(TreeNode p, TreeNode q)
	*
	*/
	@Test
	public void testIsSameTree() throws Exception {
		for (int i = 0; i < p.size(); i++) {
			boolean result = instance.isSameTree(TreeNode.buildTreeNode(p.get(i)), TreeNode.buildTreeNode(q.get(i)));
			System.out.println("Input: p = " + Arrays.toString(Arrays.stream(p.get(i)).toArray()) + " q=" +Arrays.toString(Arrays.stream(q.get(i)).toArray()));
			System.out.println("Output: " + result);
			Assert.assertEquals(bools[i], result);
		}
	}

	@Test
	public void testIsSameTree1() throws Exception {
		for (int i = 0; i < p.size(); i++) {
			boolean result = instance.isSameTree1(TreeNode.buildTreeNode(p.get(i)), TreeNode.buildTreeNode(q.get(i)));
			System.out.println("Input: p = " + Arrays.toString(Arrays.stream(p.get(i)).toArray()) + " q=" +Arrays.toString(Arrays.stream(q.get(i)).toArray()));
			System.out.println("Output: " + result);
			Assert.assertEquals(bools[i], result);
		}
	}
} 
