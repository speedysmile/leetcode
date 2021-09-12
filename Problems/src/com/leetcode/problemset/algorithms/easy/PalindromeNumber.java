package com.leetcode.problemset.algorithms.easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (x <= 9) {
			return true;
		}
		if (x % 10 == 0) {
			return false;
		}
		int num = 0;
		while (num < x) {
			num = num * 10 + x % 10;
			x /= 10;
		}
		return x == num || x == num % 10;
	}
}
