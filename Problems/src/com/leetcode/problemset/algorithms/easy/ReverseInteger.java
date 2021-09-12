package com.leetcode.problemset.algorithms.easy;

/**
 * Given a signed 32-bit integer x,
 * return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 */
public class ReverseInteger {

	private static final int MAX_VALUE = Integer.MAX_VALUE / 10;

	private static final int MIN_VALUE = Integer.MIN_VALUE / 10;

	private static final int MAX_REMAINDER = Integer.MAX_VALUE % 10;

	private static final int MIN_REMAINDER = Integer.MIN_VALUE % 10;

	public int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int remainder = x % 10;
			x /= 10;
			if (result > MAX_VALUE ||  result == MAX_VALUE && remainder > MAX_REMAINDER
					|| result < MIN_VALUE || result == MIN_VALUE && remainder < MIN_REMAINDER) {
				return 0;
			}
			result = result * 10 + remainder;
		}
		return result;
	}

	public static void main(String[] args) {
		ReverseInteger instance = new ReverseInteger();
		int num = -2147483648;
		System.out.println(instance.reverse(num));
	}
}
