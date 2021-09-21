package com.leetcode.problemset.algorithms.easy;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) return 0;
		if (target <= nums[0]) return 0;
		int start = 0, end = nums.length - 1;
		if (target > nums[end]) return end + 1;
		while (start < end) {
			int half = (start + end) / 2;
			if (nums[half] == target) {
				return half;
			}
			if (nums[half] < target) {
				start = half;
			} else {
				end = half;
			}
			if (start + 1 == end) break;
		}
		return (start + end) / 2 + 1;
	}

	public static void main(String[] args) {
		SearchInsertPosition instance = new SearchInsertPosition();
		int[] arrays = new int[] {1,3,5,6};
		int target = 7;
		int res = instance.searchInsert(arrays, target);
		System.out.println(res);
	}
}
