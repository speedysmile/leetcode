package com.leetcode.problemset.algorithms.easy;

/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		if (s == null) return false;
		if (s.length() == 0) return true;
		s = s.toLowerCase();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			char ch1 = s.charAt(i), ch2 = s.charAt(j);
			while(i < j && inValidChar(ch1)) {
				ch1 = s.charAt(++i);
			}
			while(j > i && inValidChar(ch2)) {
				ch2 = s.charAt(--j);
			}
			if (i > j || ch1 != ch2) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	private boolean inValidChar(char ch) {
		return (ch < 'a' || ch > 'z') && (ch < '0' || ch > '9');
	}
}
