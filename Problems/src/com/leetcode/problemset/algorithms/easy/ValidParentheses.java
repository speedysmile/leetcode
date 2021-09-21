package com.leetcode.problemset.algorithms.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * 1、Open brackets must be closed by the same type of brackets.
 * 2、Open brackets must be closed in the correct order.
 */
public class ValidParentheses {

	private static final Map<Character, Character> PARENTHESES_MAP = Collections.unmodifiableMap(new HashMap<Character, Character>() {
		{
			put(')', '(');
			put(']', '[');
			put('}', '{');
		}
	});

	/**
	 * 使用栈进行处理
	 *
	 * @param s 字符串
	 * @return 是否有效
	 */
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (isLeftParentheses(ch)) {
				stack.push(ch);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			if (!isMatched(stack.pop(), ch)) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	private boolean isLeftParentheses(char ch) {
		return ch == '(' || ch == '[' || ch == '{';
	}

	private boolean isMatched(char ch, char match) {
		return ch == PARENTHESES_MAP.get(match);
	}
}
