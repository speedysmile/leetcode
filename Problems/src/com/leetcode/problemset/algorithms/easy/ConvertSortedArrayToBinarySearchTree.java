package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;

/**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 *
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
 *
 */
public class ConvertSortedArrayToBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) return null;
		return buildBST(nums, 0, nums.length - 1);
	}

	/**
	 * 递归生成二叉搜索树
	 *
	 * @param nums 数组
	 * @param start 开始下标
 	 * @param end 结束下标
	 * @return 二叉搜索树
	 */
	private TreeNode buildBST(int[] nums, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			TreeNode root = new TreeNode(nums[mid]);
			root.left = buildBST(nums, start, mid - 1);
			root.right = buildBST(nums, mid + 1, end);
			return root;
		}
		return null;
	}
}
