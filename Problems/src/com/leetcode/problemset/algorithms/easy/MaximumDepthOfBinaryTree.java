package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 */
public class MaximumDepthOfBinaryTree {

	/**
	 * 递归求树的高度
	 *
	 * @param root 二叉树
	 * @return 树高度
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	/**
	 * 非递归求树的高度
	 *
	 * @param root 二叉树
	 * @return 树的高度
	 */
	public int maxDepth1(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int deep = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		Queue<TreeNode> temp = new LinkedList<>();
		TreeNode node;
		queue.offer(root);
		while(!queue.isEmpty()) {
			deep++;
			while ((node = queue.poll()) != null) {
				if (node.left != null) {
					temp.offer(node.left);
				}
				if (node.right != null) {
					temp.offer(node.right);
				}
			}
			Queue<TreeNode> t = queue;
			queue = temp;
			temp = t;
		}
		return deep;
	}
}
