package com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge4;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		// create a nodeValue with default value of 0 or any number
		// for simplicity we assign it with 0
		ListNode newHead = new ListNode(0);
		ListNode current = newHead;

		while (carry != 0 || l1 != null || l2 != null) {
			// initialize sum = 0
			int sum = 0;
			// if l1 ListNode is not null meaning it's have a value inside of it.
			if (l1 != null)
				sum += l1.val;
			// if l2 ListNode is not null meaning it's have a value inside of it.
			if (l2 != null)
				sum += l2.val;
			// add carry value element from the previous sum calculation
			sum += carry;

			// if the value of sum is two digit we take the remainder and pass the carry for
			// the next sum calculation
			int remainder = sum % 10;
			carry = sum / 10;
			// create a new nodeList with the value of the remainder
			current.next = new ListNode(remainder);
			// move the pointer
			current = current.next;

			// Move to the next nodes
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		return newHead.next; // get the head of first node

	}

}
