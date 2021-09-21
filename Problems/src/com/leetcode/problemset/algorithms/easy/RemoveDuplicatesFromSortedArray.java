package com.leetcode.problemset.algorithms.easy;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Custom Judge:
 *
 * The judge will test your solution with the following code:
 *
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 *
 * int k = removeDuplicates(nums); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if (nums == null) {
			return 0;
		}
		int index = 0, temp = 0, len = nums.length;
		while (index < len && temp < len) {
			if (nums[temp] > nums[index]) {
				nums[++index] = nums[temp];
			}
			temp++;
		}
		return index + 1;
	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray instance = new RemoveDuplicatesFromSortedArray();
		int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		System.out.println(instance.removeDuplicates(nums));
	}
}
