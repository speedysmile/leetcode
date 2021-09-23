package com.leetcode.problemset.algorithms.easy;

/**
 * Given an integer array arr, return the length of a maximum size turbulent subarray of arr.
 *
 * A subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.
 *
 * More formally, a subarray [arr[i], arr[i + 1], ..., arr[j]] of arr is said to be turbulent if and only if:
 *
 * For i <= k < j:
 * arr[k] > arr[k + 1] when k is odd, and
 * arr[k] < arr[k + 1] when k is even.
 * Or, for i <= k < j:
 * arr[k] > arr[k + 1] when k is even, and
 * arr[k] < arr[k + 1] when k is odd.
 *
 */
public class LongestTurbulentSubarray {

	public int maxTurbulenceSize(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		if (arr.length == 1) {
			return 1;
		}
		int max = 0;
		int pre = Integer.compare(arr[0], arr[1]);
		int sum = pre == 0 ? 1 : 2;
		int cur;
		for (int i = 1; i < arr.length - 1; i++) {
			cur = Integer.compare(arr[i], arr[i+1]);
			if (cur == 0) {
				max = Integer.max(sum, max);
				pre = cur;
				sum = 1;
				continue;
			}
			if (pre == 0 || pre * cur < 0) {
				sum += 1;
				pre = cur;
				continue;
			}
			max = Integer.max(sum, max);
			sum = 2;
			pre = cur;
		}
		return Integer.max(max, sum);
	}

}
