package com.leetcode.problemset.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* UniqueEmailAddresses Tester. 
* 
* @author <Authors name> 
* @since <pre>9ÔÂ 28, 2021</pre> 
* @version 1.0 
*/ 
public class UniqueEmailAddressesTest {

	private UniqueEmailAddresses instance;

	@Before
	public void before() throws Exception {
		instance = new UniqueEmailAddresses();
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: numUniqueEmails(String[] emails)
	*
	*/
	@Test
	public void testNumUniqueEmails() throws Exception {
		String[] emails = new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int res = instance.numUniqueEmails(emails);
		Assert.assertEquals(2, res);

		emails = new String[] {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
		res = instance.numUniqueEmails(emails);
		Assert.assertEquals(3, res);
	}
} 
