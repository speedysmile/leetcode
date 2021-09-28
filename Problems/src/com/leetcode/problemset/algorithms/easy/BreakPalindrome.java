package com.leetcode.problemset.algorithms.easy;

/**
 * Given a palindromic string of lowercase English letters palindrome,
 * replace exactly one character with any lowercase English letter
 * so that the resulting string is not a palindrome and that it is the lexicographically smallest one possible.
 *
 * Return the resulting string. If there is no way to replace a character to make it not a palindrome, return an empty string.
 *
 * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ,
 * a has a character strictly smaller than the corresponding character in b. For example,
 * "abcc" is lexicographically smaller than "abcd" because the first position they differ is at the fourth character, and 'c' is smaller than 'd'.
 */
public class BreakPalindrome {

	public String breakPalindrome(String palindrome) {
		if (palindrome == null || palindrome.length() <= 1) {
			return "";
		}
		char[] chars = palindrome.toCharArray();
		int mid = chars.length / 2;
		for (int i = 0; i < mid; i++) {
			if (chars[i] != 'a') {
				chars[i] = 'a';
				return new String(chars);
			}
		}
		chars[chars.length - 1] = 'b';
		return new String(chars);
	}
}
