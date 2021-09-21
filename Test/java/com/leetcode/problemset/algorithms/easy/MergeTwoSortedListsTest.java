package com.leetcode.problemset.algorithms.easy;

import com.leetcode.problemset.algorithms.common.ListNode;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


/** 
* MergeTwoSortedLists Tester. 
* 
* @author <Authors name> 
* @since <pre>9�� 21, 2021</pre> 
* @version 1.0 
*/ 
public class MergeTwoSortedListsTest {

	private MergeTwoSortedLists instance;

	private Map<int[], int[]> duplicateMap = new HashMap<>();

	private List<int[]> list1 = new ArrayList<>();

	private List<int[]> list2 = new ArrayList<>();

	private List<int[]> merge = new ArrayList<>();

	@Before
	public void before() throws Exception {
		instance = new MergeTwoSortedLists();
		addDuplicateMap();
		addMergeList();
	}

	private void addMergeList() {
		list1.add(new int[] {1,2,4});
		list1.add(new int[] {});
		list1.add(new int[] {});

		list2.add(new int[] {1,3,4});
		list2.add(new int[] {});
		list2.add(new int[] {0});

		merge.add(new int[] {1,1,2,3,4,4});
		merge.add(new int[] {});
		merge.add(new int[] {0});
	}

	private void addDuplicateMap() {
		duplicateMap.put(new int[] {1,1,2}, new int[] {1,2});
		duplicateMap.put(new int[] {1,1,2,3,3}, new int[] {1,2,3});
		duplicateMap.put(new int[] {}, new int[] {});
	}

	@After
	public void after() throws Exception {
	}

	/**
	*
	* Method: mergeTwoLists(ListNode l1, ListNode l2)
	*
	*/
	@Test
	public void testMergeTwoLists() throws Exception {
		for (int i = 0; i < merge.size(); i++) {
			ListNode l1 = ListNode.buildFromArray(list1.get(i));
			ListNode l2 = ListNode.buildFromArray(list2.get(i));
			ListNode mergeList = instance.mergeTwoLists(l1, l2);
			Assert.assertArrayEquals(merge.get(i), ListNode.toArray(mergeList));
		}
	}

	/**
	*
	* Method: deleteDuplicates(ListNode head)
	*
	*/
	@Test
	public void testDeleteDuplicates() throws Exception {
		for (Map.Entry<int[], int[]> entry: duplicateMap.entrySet()) {
			Assert.assertArrayEquals(entry.getValue(),
					ListNode.toArray(instance.deleteDuplicates(ListNode.buildFromArray(entry.getKey()))));
		}
	}
} 
