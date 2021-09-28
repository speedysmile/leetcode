package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * Note: A leaf is a node with no children.
 */
public class MinimumDepthBinaryTree {

	/**
	 * 递归求最小深度
	 *
	 * @param root 二叉树
	 * @return 最小深度
	 */
	public int minDepth(TreeNode root) {
		if (root == null) return 0;
		if (root.left == null && root.right == null) return 1;
		if (root.left == null) return 1 + minDepth(root.right);
		if (root.right == null) return 1 + minDepth(root.left);
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

	/**
	 * 非递归求最小深度，使用队列按层遍历二叉树
	 *
	 * @param root
	 * @return
	 */
	public int minDepth1(TreeNode root) {
		if (root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int deep = 0;
		TreeNode tmp;
		int size;
		while (true) {
			deep++;
			size = queue.size();
			while (size-- > 0) {
				tmp = queue.poll();
				if (tmp.left == null && tmp.right == null) return deep;
				if (tmp.left != null) {
					queue.offer(tmp.left);
				}
				if (tmp.right != null) {
					queue.offer(tmp.right);
				}
			}
		}
//		return deep;
	}
}
