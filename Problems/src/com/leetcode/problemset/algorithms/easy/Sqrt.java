package com.leetcode.problemset.algorithms.easy;

/**
 * Given a non-negative integer x, compute and return the square root of x.
 *
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 *
 * Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
 *
 */
public class Sqrt {
	public int mySqrt(int x) {
		int i = 1;
		while (x >> i > 1 << i) {
			i++;
		}
		int max = 1 << i;
		int min = x >> i;
		if (min == max) {
			return max;
		}
		while (min < max) {
			int half = (min + max) / 2;
			if (half == x / half) {
				return half;
			}
			if (half > x / half) {
				max = half;
			} else {
				min = half;
			}
			if (min + 1 == max) break;
		}
		return min;
	}
}
