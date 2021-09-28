package com.leetcode.problemset.algorithms.easy;

/**
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 *
 * Given n, return the value of Tn.
 *
 */
public class NthTribonacciNumber {

	public int tribonacci(int n) {
		if (n == 0) return 0;
		if (n <= 2) return 1;
		int[] var = new int[3];
		var[1] = 1;
		var[2] = 1;
		for (int i = 3; i <= n; i++) {
			var[i%3] = var[0] + var[1] + var[2];
		}
		return var[n%3];
	}

	public int fib(int n) {
		if (n <= 1) return n;
		int[] var = new int[2];
		var[1] = 1;
		for (int i = 2; i <= n; i++) {
			var[i%2] = var[0] + var[1];
		}
		return var[n%2];
	}
}
