package com.leetcode.problemset.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.
 *
 * For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
 * If you add periods '.' between some characters in the local name part of an email address,
 * mail sent there will be forwarded to the same address without dots in the local name.
 * Note that this rule does not apply to domain names.
 *
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 *
 * If you add a plus '+' in the local name, everything after the first plus sign will be ignored.
 * This allows certain emails to be filtered.
 * Note that this rule does not apply to domain names.
 *
 * For example, "m.y+name@email.com" will be forwarded to "my@email.com".
 * It is possible to use both of these rules at the same time.
 *
 * Given an array of strings emails where we send one email to each email[i], return the number of different addresses that actually receive mails.
 *
 */
public class UniqueEmailAddresses {
	public int numUniqueEmails(String[] emails) {
		if (emails == null || emails.length == 0) {
			return 0;
		}
		Set<String> res = new HashSet<>();
		for (String email : emails) {
			String add = exactAddress(email);
			res.add(add);
		}
		return res.size();
	}

	private String exactAddress(String email) {
		StringBuilder sb = new StringBuilder();
		int length = email.length();
		int index = 0;
		while(index < length) {
			char ch = email.charAt(index);
			if (ch == '@') {
				sb.append(email.substring(index));
				break;
			}
			if (ch == '.') {
				index++;
				continue;
			}
			if (ch == '+') {
				while (index < length - 1 && (ch = email.charAt(++index)) != '@');
				sb.append(email.substring(index));
				break;
			}
			sb.append(ch);
			index++;
		}
		return sb.toString();
	}
}
