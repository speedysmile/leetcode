package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;

import java.util.Stack;

/**
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 *
 * A leaf is a node with no children.
 *
 */
public class PathSum {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) return false;
		if (root.val == targetSum && root.left == null && root.right == null) return true;
		targetSum = targetSum - root.val;
		return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
	}
}
