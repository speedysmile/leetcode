package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树遍历
 */
public class BinaryTreeTraversal {

	/**
	 * 二叉树中序遍历
	 *
	 * @param root 树根节点
	 * @return 节点顺序
	 */
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		inorderByRecurrence(root, result);
		return result;
	}

	/**
	 * 递归实现中序遍历二叉树
	 *
	 * @param root 二叉树
	 * @param result 顺序列表
	 */
	public void inorderByRecurrence(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		}
		inorderByRecurrence(root.left, result);
		result.add(root.val);
		inorderByRecurrence(root.right, result);
	}

	public void inorderByForeach(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while (cur != null || !stack.isEmpty()) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			result.add(cur.val);
			cur = cur.right;
		}
	}
}
