package com.bptn.leetcode_challenege_section_3_team3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge1.AverageSalary;
import com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge2.SortedSquare;
import com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge3.MissingNumber;
import com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge4.AddTwoNumbers;
import com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge4.ListNode;
import com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge5.MergeTwoLists;

public class LeetCodeJunit {

	@Test
	public void testAverageSalary() {
		AverageSalary avg = new AverageSalary();

		int[] salary = new int[] { 4000, 3000, 1000, 2000 };
		double expectedAvg = 2500.00000;
		int[] salary2 = new int[] { 1000, 2000, 3000 };
		double expectedAvg2 = 2000.00000;

		assertTrue(expectedAvg == avg.average(salary));
		assertTrue(expectedAvg2 == avg.average(salary2));
	}

	@Test
	public void testSortedSquare() {
		SortedSquare sortSqr = new SortedSquare();

		int[] arr1 = new int[] { -4, -1, 0, 3, 10 };
		int[] arr2 = new int[] { -7, -3, 2, 3, 11 };

		assertArrayEquals(new int[] { 0, 1, 9, 16, 100 }, sortSqr.sortedSquares(arr1));
		assertArrayEquals(new int[] { 4, 9, 9, 49, 121 }, sortSqr.sortedSquares(arr2));
	}

	@Test
	public void testMissingNumber() {

		assertEquals(2, MissingNumber.missingNumber(new int[] { 3, 0, 1 }));
		assertEquals(2, MissingNumber.missingNumber(new int[] { 0, 1 }));
		assertEquals(8, MissingNumber.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));

	}

	@Test
	public void testAddTwoNumbers() {
		AddTwoNumbers addTwo = new AddTwoNumbers();
		ListNode l1 = ListNode.arrayToListNode(new int[] { 2, 4, 3 });
		ListNode l2 = ListNode.arrayToListNode(new int[] { 5, 6, 4 });
		ListNode expectedSum = ListNode.arrayToListNode(new int[] { 7, 0, 8 });
		ListNode actualSum = addTwo.addTwoNumbers(l1, l2);
		assertEquals(true, ListNode.areEqual(expectedSum, actualSum));
	}

	@Test
	public void testMergeTwoSortList() {
		MergeTwoLists mergeTwoSort = new MergeTwoLists();
		// first sorted listNode
		ListNode sortL1 = ListNode.arrayToListNode(new int[] { 1, 2, 4 });
		// second sorted listNode
		ListNode sortL2 = ListNode.arrayToListNode(new int[] { 1, 3, 4 });

		// expected sort list
		ListNode expectedSortList = ListNode.arrayToListNode(new int[] { 1, 1, 2, 3, 4, 4 });
		// actual sort list
		ListNode actualSortList = mergeTwoSort.mergeTwoLists(sortL1, sortL2);

		assertEquals(true, ListNode.areEqual(expectedSortList, actualSortList));

	}

}
