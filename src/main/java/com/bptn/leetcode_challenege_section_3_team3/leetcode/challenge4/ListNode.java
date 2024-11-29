package com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge4;

public class ListNode {
	private int val;
	private ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public int getValue() {
		return val;
	}

	public ListNode getNext() {
		return this.next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	// static method that changes array into nodelist
	public static ListNode arrayToListNode(int[] values) {
		if (values == null || values.length == 0)
			return null;

		ListNode head = new ListNode(values[0]);
		ListNode current = head;
		current.setNext(new ListNode(2));

		for (int i = 1; i < values.length; i++) {

			current.setNext(new ListNode(values[i]));
			current = current.getNext();

		}

		return head;
	}

	// compare two nodeList
	public static boolean areEqual(ListNode l1, ListNode l2) {
		while (l1 != null && l2 != null) {
			if (l1.getValue() != l2.getValue())
				return false;

			l1 = l1.getNext();
			l2 = l2.getNext();
		}
		return l1 == null && l2 == null;
	}

}
