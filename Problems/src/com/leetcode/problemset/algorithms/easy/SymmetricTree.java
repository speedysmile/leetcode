package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;
		return isSymmetricRecur(root.left, root.right);
	}

	/**
	 * 递归调用，判断左右子树是否相似
	 *
	 * @param left 左子树
	 * @param right 右子树
	 * @return 是否相似
	 */
	private boolean isSymmetricRecur(TreeNode left, TreeNode right) {
		if (left == null && right == null) return true;
		if (left == null || right == null) return false;
		if (left.val != right.val) return false;
		return isSymmetricRecur(left.left, right.right)
				&& isSymmetricRecur(left.right, right.left);
	}

	/**
	 * 非递归调用，判断左右子树是否相似，利用队列遍历左右子树
	 *
	 * @param left 左子树
	 * @param right 右子树
	 * @return 是否相似
	 */
	private boolean isSymmetricIterate(TreeNode left, TreeNode right) {
		Queue<TreeNode> pQueue = new LinkedList<>();
		Queue<TreeNode> qQueue = new LinkedList<>();
		pQueue.offer(left);
		qQueue.offer(right);
		TreeNode pNode, qNode;
		while (!pQueue.isEmpty() || !qQueue.isEmpty()) {
			pNode = pQueue.poll();
			qNode = qQueue.poll();
			if (pNode == null && qNode == null) continue;
			if (pNode == null || qNode == null) return false;
			if (pNode.val != qNode.val) return false;
			pQueue.offer(pNode.left);
			pQueue.offer(pNode.right);
			qQueue.offer(qNode.right);
			qQueue.offer(qNode.left);
		}
		return true;
	}
}
