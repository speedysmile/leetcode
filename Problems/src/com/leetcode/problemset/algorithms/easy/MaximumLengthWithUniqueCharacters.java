package com.leetcode.problemset.algorithms.easy;

import sun.security.util.BitArray;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr that has unique characters.
 *
 * Return the maximum possible length of s.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 */
public class MaximumLengthWithUniqueCharacters {

	public int maxLength(List<String> arr) {
		int max = 0;
		Set<String> set = new HashSet<>();
		for (String str : arr) {
			if (!isUnique(str)) continue;
			Set<String> temSet = new HashSet<>();
			for (String temp : set) {
				String stmp = temp + str;
				if (set.contains(stmp)) continue;
				if (isUnique(stmp)) {
					temSet.add(stmp);
					max = Integer.max(max, stmp.length());
				}
			}
			set.addAll(temSet);
			set.add(str);
			max = Integer.max(max, str.length());
		}
		return max;
	}

	private boolean isUnique(String str) {
		int charBit = 0;
		for (char ch : str.toCharArray()) {
			int bit = 1 << (ch - 'a');
			if ((charBit & bit) > 0) return false;
			charBit += bit;
		}
		return true;
	}
}
