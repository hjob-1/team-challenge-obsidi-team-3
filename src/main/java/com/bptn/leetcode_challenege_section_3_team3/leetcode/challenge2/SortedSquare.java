package com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge2;

public class SortedSquare {
	public int[] sortedSquares(int[] nums) {

		// sqaure the values
		for (int i = 0; i < nums.length; i++) {
			// square the each value
			nums[i] = nums[i] * nums[i];
		}
		// sort the values in ascending order
		bubbleSort(nums);
		return nums;
	}

	public void bubbleSort(int array[]) {
		int size = array.length;
		// loop for every element
		for (int i = 0; i < size - 1; i++) {

			// loop for comparison
			for (int j = 0; j < size - 1; j++) {
				// if the value on the left is greater than the value on the right, we swap
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
