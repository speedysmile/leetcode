package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.ListNode;

/**
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 */
public class MergeTwoSortedLists {

	/**
	 * 21. Merge Two Sorted Lists
	 * 双指针依次插入最小的节点
	 *
	 * @param l1 列表1
	 * @param l2 列表2
	 * @return 合并后的列表
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null ) {
			return l1;
		}
		ListNode head = new ListNode();
		ListNode temp, tail = head;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				temp = l1;
				l1 = l1.next;
			} else {
				temp = l2;
				l2 = l2.next;
			}
			temp.next = null;
			tail.next = temp;
			tail = tail.next;
		}
		if (l1 != null) {
			tail.next = l1;
		}
		if (l2 != null) {
			tail.next = l2;
		}
		return head.next;
	}

	/**
	 * 83. Remove Duplicates from Sorted List
	 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
	 *
	 * @param head list列表
	 * @return 无重复数据list
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode temp = head;
		int val = head.val;
		while (temp.next != null) {
			if (temp.next.val == val) {
				temp.next = temp.next.next;
				continue;
			}
			val = temp.next.val;
			temp = temp.next;
		}
		return head;
	}
}
