package com.leetcode.problemset.algorithms.easy;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class AddBinary {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1, j = b.length() - 1;
		int cur = 0;
		while (i >= 0 || j >= 0) {
			if (i >= 0) cur += (a.charAt(i) - '0');
			if (j >= 0) cur += (b.charAt(j) - '0');
			sb.insert(0, cur % 2);
			cur /= 2;
			i--;
			j--;
		}
		if (cur == 1) {
			sb.insert(0, cur);
		}
		return sb.toString();
	}
}
