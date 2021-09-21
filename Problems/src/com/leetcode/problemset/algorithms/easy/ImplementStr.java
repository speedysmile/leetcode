package com.leetcode.problemset.algorithms.easy;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class ImplementStr {

	public int strStr(String haystack, String needle) {
		if (needle == null || needle.isEmpty()) {
			return 0;
		}
		if (haystack == null || haystack.isEmpty()) {
			return -1;
		}
		int sourceLength = haystack.length();
		int targetLength = needle.length();
		if (targetLength > sourceLength) {
			return -1;
		}
		int max = sourceLength - targetLength;
		char first = needle.charAt(0);
		for (int i = 0; i <= max; i++) {
			while (i <= max && haystack.charAt(i) != first) {
				i++;
			}
			if (i <= max) {
				int j = i + 1;
				int end = i + targetLength;
				for (int k = 1; k < targetLength; k++, j++) {
					if (haystack.charAt(j) != needle.charAt(k)) break;
				}

				if (j == end) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ImplementStr instance = new ImplementStr();
		String haystack = "a", needle = "a";
		System.out.println(instance.strStr(haystack, needle));
		System.out.println(haystack.indexOf(needle));
	}
}
