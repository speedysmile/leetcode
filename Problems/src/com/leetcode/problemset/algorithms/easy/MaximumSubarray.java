package com.leetcode.problemset.algorithms.easy;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * A subarray is a contiguous part of an array.
 *
 */
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
//		return getMaxByDp(nums);
		return getMaxByDivide(nums);
	}

	/**
	 * 求最大子数组 -- 动态规划 时间复杂度O(n), 空间复杂度O(1)
	 *
	 * @param nums 数组
	 * @return 最大子数组的和
	 */
	private int getMaxByDp(int[] nums) {
		int max = nums[0];
		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			temp = Math.max(temp + nums[i], nums[i]);
			max = Math.max(max, temp);
		}
		return max;
	}

	private int getMaxByDivide(int[] nums) {
		return getMax(nums, 0, nums.length - 1);
	}

	private int getMax(int[] nums, int left, int right) {
		if (left == right) {
			return nums[left];
		}
		if (left + 1 == right) {
			return Math.max(nums[left] + nums[right], Math.max(nums[left], nums[right]));
		}
		int half = (left + right) / 2;
		int maxLeft = getMax(nums, left, half);
		int maxRight = getMax(nums, half + 1, right);
		int sum = 0;
		int maxSumLeft = Integer.MIN_VALUE;
		for (int i = half; i >= left; i--) {
			sum += nums[i];
			maxSumLeft = Math.max(maxSumLeft, sum);
		}
		sum = 0;
		int maxSumRight = Integer.MIN_VALUE;
		for (int i = half + 1; i <= right; i++) {
			sum += nums[i];
			maxSumRight = Math.max(maxSumRight, sum);
		}
		return Math.max(maxSumLeft + maxSumRight, Math.max(maxLeft, maxRight));
	}
}
