package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as:
 *
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 */
public class BalancedBinaryTree {

	/**
	 * 是否是平衡二叉树
	 * 每个节点的左右子树高度相差不超过1
	 *
	 * @param root 二叉树
	 * @return 是否平衡
	 */
	public boolean isBalanced(TreeNode root) {
		if (root == null) return true;
		return deepTree(root) != -1;
	}

	private int deepTree(TreeNode root) {
		if (root == null) return 0;
		int left = deepTree(root.left);
		if (left == -1) return -1;
		int right = deepTree(root.right);
		if (right == -1) return -1;
		if (Math.abs(left - right) > 1) return -1;
		return Math.max(left, right) + 1;
	}
}
