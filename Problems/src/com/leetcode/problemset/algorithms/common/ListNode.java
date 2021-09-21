package com.leetcode.problemset.algorithms.common;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode() {}
	public ListNode(int val) { this.val = val; }
	public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

	public static ListNode buildFromArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		ListNode head = new ListNode(nums[0]);
		ListNode cur = head;
		for (int i = 1; i < nums.length; i++) {
			cur.next = new ListNode(nums[i]);
			cur = cur.next;
		}
		return head;
	}

	public static int[] toArray(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int[] result = new int[list.size()];
		int index = 0;
		for (int num : list) {
			result[index++] = num;
		}
		return result;
	}
}
