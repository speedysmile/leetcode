package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
* SymmetricTree Tester. 
* 
* @author <Authors name> 
* @since <pre>9�� 23, 2021</pre> 
* @version 1.0 
*/ 
public class SymmetricTreeTest {

	private SymmetricTree instance;

	List<Integer[]> p = new ArrayList<>();

	boolean[] bools;

	@Before
	public void before() throws Exception {
		instance = new SymmetricTree();

		p.add(new Integer[]{1,2,2,3,4,4,3});
		p.add(new Integer[]{1,2,2,null,3,null,3});
		p.add(new Integer[]{1,2,3});

		bools = new boolean[] {true, false, false};
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: isSymmetric(TreeNode root)
	*
	*/
	@Test
	public void testIsSymmetric() throws Exception {
		for (int i = 0; i < p.size(); i++) {
			boolean result = instance.isSymmetric(TreeNode.buildTreeNode(p.get(i)));
			System.out.println("Input: p = " + Arrays.toString(Arrays.stream(p.get(i)).toArray()));
			System.out.println("Output: " + result);
			Assert.assertEquals(bools[i], result);
		}
	}


	/**
	*
	* Method: isSymmetricRec(TreeNode left, TreeNode right)
	*
	*/
	@Test
	public void testIsSymmetricRec() {
		for (int i = 0; i < p.size(); i++) {
			TreeNode tree = TreeNode.buildTreeNode(p.get(i));
			try {
				Method method = SymmetricTree.class.getDeclaredMethod("isSymmetricRecur", TreeNode.class, TreeNode.class);
				method.setAccessible(true);
				boolean result = (boolean) method.invoke(instance, tree.left, tree.right);
				System.out.println("Input: p = " + Arrays.toString(Arrays.stream(p.get(i)).toArray()));
				System.out.println("Output: " + result);
				Assert.assertEquals(bools[i], result);
			} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}


	@Test
	public void testIsSymmetricIterate() throws Exception {
		for (int i = 0; i < p.size(); i++) {
			TreeNode tree = TreeNode.buildTreeNode(p.get(i));
			try {
				Method method = SymmetricTree.class.getDeclaredMethod("isSymmetricIterate", TreeNode.class, TreeNode.class);
				method.setAccessible(true);
				boolean result = (boolean) method.invoke(instance, tree.left, tree.right);
				System.out.println("Input: p = " + Arrays.toString(Arrays.stream(p.get(i)).toArray()));
				System.out.println("Output: " + result);
				Assert.assertEquals(bools[i], result);
			} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

} 
