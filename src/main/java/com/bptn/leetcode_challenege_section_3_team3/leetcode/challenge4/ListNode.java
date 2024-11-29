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

}
