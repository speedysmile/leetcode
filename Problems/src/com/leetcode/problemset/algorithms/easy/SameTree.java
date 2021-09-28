package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 *
 */
public class SameTree {

	/**
	 * 判断两颗树是否相等 -- 递归
	 *
	 * @param p 树p
	 * @param q 树q
	 * @return 是否相等
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true;
		if (p == null || q == null) return false;
		if (p.val != q.val) {
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	/**
	 * 判断两个树是否相等 -- 非递归
	 * 借助队列遍历两棵树的所有节点，判断节点是否相等
	 *
	 * @param p 树p
	 * @param q 树q
	 * @return 是否相等
	 */
	public boolean isSameTree1(TreeNode p, TreeNode q) {
		Queue<TreeNode> pQueue = new LinkedList<>();
		Queue<TreeNode> qQueue = new LinkedList<>();
		pQueue.offer(p);
		qQueue.offer(q);
		TreeNode pNode, qNode;
		while (!pQueue.isEmpty() || !qQueue.isEmpty()) {
			pNode = pQueue.poll();
			qNode = qQueue.poll();
			if (pNode == null && qNode == null) continue;
			if (pNode == null || qNode == null) return false;
			if (pNode.val != qNode.val) return false;
			pQueue.offer(pNode.left);
			pQueue.offer(pNode.right);
			qQueue.offer(qNode.left);
			qQueue.offer(qNode.right);
		}
		return true;
	}
}
