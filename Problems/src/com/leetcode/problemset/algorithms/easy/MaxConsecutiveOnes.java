package com.leetcode.problemset.algorithms.easy;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int temp = 0;
		int max = 0;
		for (int num : nums) {
			if (num == 0) {
				max = Math.max(max, temp);
				temp = 0;
			} else {
				temp += 1;
			}
		}
		return Math.max(max, temp);
	}
}
