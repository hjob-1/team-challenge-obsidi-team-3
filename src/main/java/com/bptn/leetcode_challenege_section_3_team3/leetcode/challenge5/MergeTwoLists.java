package com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge5;

import com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge4.ListNode;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// create new head
		ListNode head = new ListNode(0);
		ListNode current = head;
		while (list1 != null && list2 != null) {
			// compare the value of list1 and list2
			if (list1.getValue() <= list2.getValue()) {
				// if the list1 value is less than the list2 value assign the current next
				// pointer to this Node.
				current.setNext(list1);
				// append the current list1 to point to the next Node address.
				list1 = list1.getNext();
			} else {
				current.setNext(list2);
				// append the current list2 to point to the next Node address.
				list2 = list2.getNext();
			}
			// current now points to null
			current = current.getNext();
		}

		// Assign remaining nodes of list1 to the merged list
		if (list1 != null) {
			current.setNext(list1);
		}
		// If the list2 is not null Assign remaining nodes of list2 to the merged list
		else if (list2 != null) {
			current.setNext(list2);
		}

		return head.getNext();

	}
}
