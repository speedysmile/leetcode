package com.leetcode.problemset.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 */
public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		res.add(Arrays.asList(1));
		if (numRows == 1) return res;
		for (int i = 2; i <= numRows; i++) {
			List<Integer> row = new ArrayList<>();
			row.add(1);
			List<Integer> pre = res.get(i - 2);
			for (int j = 1; j < pre.size(); j++) {
				row.add(pre.get(j) + pre.get(j - 1));
			}
			row.add(1);
			res.add(row);
		}
		return res;
	}

	public List<Integer> getRow(int rowIndex) {
		if (rowIndex == 0) return Collections.singletonList(1);
		if (rowIndex == 1) return Arrays.asList(1,1);
		Integer[] res = new Integer[rowIndex + 1];
		res[0] = 1;
		res[1] = 1;
		for (int i = 2; i <= rowIndex; i++) {
			for (int j = i - 1; j > 0; j--) {
				res[j] = res[j] + res[j - 1];
			}
			res[i] = 1;
		}
		return Arrays.asList(res);
	}
}
