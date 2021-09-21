package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* MergeSortedArray Tester. 
* 
* @author <Authors name> 
* @since <pre>9�� 21, 2021</pre> 
* @version 1.0 
*/ 
public class MergeSortedArrayTest {

	private MergeSortedArray instance;
	private int[] nums1;
	private int[] nums2;
	private int[] output;
	private int m;
	private int n;

	@Before
	public void before() throws Exception {
		instance = new MergeSortedArray();
	}

	@After
	public void after() throws Exception {
	}

	private void init1() {
		nums1 = new int[] {1,2,3,0,0,0};
		nums2 = new int[] {2,5,6};
		m = 3;
		n = 3;
		output = new int[] {1,2,2,3,5,6};
	}

	private void init2() {
		nums1 = new int[] {1};
		nums2 = new int[] {};
		m = 1;
		n = 0;
		output = new int[] {1};
	}

	private void init3() {
		nums1 = new int[] {0};
		nums2 = new int[] {1};
		m = 0;
		n = 1;
		output = new int[] {1};
	}

	/**
	*
	* Method: merge(int[] nums1, int m, int[] nums2, int n)
	*
	*/
	@Test
	public void testMerge() throws Exception {
		init1();
		instance.merge(nums1, m, nums2, n);
		Assert.assertArrayEquals(output, nums1);

		init2();
		instance.merge(nums1, m, nums2, n);
		Assert.assertArrayEquals(output, nums1);

		init3();
		instance.merge(nums1, m, nums2, n);
		Assert.assertArrayEquals(output, nums1);
	}
} 
