package com.leetcode.problemset.algorithms.easy;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
		int index = digits.length - 1;
		while (index >= 0) {
			if (digits[index] < 9) {
				digits[index] = digits[index] + 1;
				break;
			}
			digits[index] = 0;
			index--;
		}
		if (index > 0 || index == 0 && digits[0] != 0) {
			return digits;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		System.arraycopy(digits, 0, result, 1, digits.length);
		return result;
	}
}
