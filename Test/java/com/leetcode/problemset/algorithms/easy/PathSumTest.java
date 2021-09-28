package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/** 
* PathSum Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 26, 2021</pre> 
* @version 1.0 
*/ 
public class PathSumTest {

	private PathSum instance;

	private List<Integer[]> trees;

	private int[] target;

	private boolean[] res;

	@Before
	public void before() throws Exception {
		instance = new PathSum();

		trees = new ArrayList<>();
		trees.add(new Integer[] {5,4,8,11,null,13,4,7,2,null,null,null,1});
		trees.add(new Integer[] {1,2,3});

		target = new int[] {22, 5};

		res = new boolean[] {true, false};
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: hasPathSum(TreeNode root, int targetSum)
	*
	*/
	@Test
	public void testHasPathSum() throws Exception {
		for (int i = 0; i < trees.size(); i++) {
			TreeNode root = TreeNode.buildTreeNode(trees.get(i));
			boolean result = instance.hasPathSum(root, target[i]);
			Assert.assertEquals(res[i], result);
		}
	}

} 
