package com.leetcode.problemset.algorithms.easy;

/**
 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 */
public class LengthofLastWord {

	public int lengthOfLastWord(String s) {
		s = s.trim();
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}
