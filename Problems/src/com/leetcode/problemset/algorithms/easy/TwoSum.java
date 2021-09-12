package com.leetcode.problemset.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 */
public class TwoSum {

	/**
	 * 使用hashMap存储数组元素和下标，利用hash表查找效率为O(1)，算法的时间复杂度为O(n),空间复杂度为O(n)
	 *
	 * @param nums 数组
	 * @param target 目标
	 * @return 数组小标集合
	 */
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> indexMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int left = target - nums[i];
			if (indexMap.containsKey(left)) {
				return new int[] {indexMap.get(left), i};
			}
			indexMap.put(nums[i], i);
		}
		return new int[0];
	}
}
