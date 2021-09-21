package com.leetcode.problemset.algorithms.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 */
public class LongestCommonPrefix {

	/**
	 * 1、假设第一个元素就是最长公共子串，令最长公共子串的长度为第一个元素长度
	 * 2、从第二个元素开始，如果是以最长公共子串开头则继续下一个
	 * 3、不是最长公共子串，则最长公共子串长度减一
	 * 4、如果最长长度为0则返回空，否则返回第一个元素从第0个到最大长度减一的子字符串
	 *
	 * @param strs 查找字符串
	 * @return 最长公共子串
	 */
	public String longestCommonPrefix(String[] strs) {
		if (strs != null && strs.length > 0) {
			int max = strs[0].length();
			String temp = strs[0];
			for(int i = 1; i < strs.length; i++) {
				String str = strs[i];
				while (max > 0 && !str.startsWith(temp.substring(0, max))) {
					max--;
				}
				if (max == 0) {
					return "";
				}
			}
			return temp.substring(0, max);
		}
		return "";
	}
}
