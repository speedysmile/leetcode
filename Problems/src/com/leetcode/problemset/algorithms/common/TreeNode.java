package com.leetcode.problemset.algorithms.common;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	public int val;

	public TreeNode left;

	public TreeNode right;

	public TreeNode() {}

	public TreeNode(int val) { this.val = val; }

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public static TreeNode buildTreeNode(Integer[] list) {
		if (list == null || list.length == 0) {
			return null;
		}
		TreeNode root = new TreeNode(list[0]);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int i = 1;
		while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			if (cur == null) continue;
			if (i < list.length) {
				cur.left = buildNode(list, i++);
			}
			if (i < list.length) {
				cur.right = buildNode(list, i++);
			}
			if (cur.left != null) queue.offer(cur.left);
			if (cur.right != null) queue.offer(cur.right);
		}
		return root;
	}

	private static TreeNode buildNode(Integer[] vals, int index) {
		if (vals[index] == null) {
			return null;
		}
		return new TreeNode(vals[index]);
	}

	public static void printTree(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + "\t");
		printTree(root.left);
		printTree(root.right);
	}
}
