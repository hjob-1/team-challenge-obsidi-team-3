package com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge3;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		// find the range
		// [0, n]
		int endRange = nums.length;
		boolean found = false;
		// If there is not missing number we indicate by returning -1
		int missingNum = -1;

		for (int startRange = 0; startRange <= endRange; startRange++) {
			// reset found value
			found = false;

			for (int index = 0; index < nums.length; index++) {

				// If the range is found with in the array we update found value to true
				if (nums[index] == startRange) {
					found = true;
					// if the range is found we exited from the inner loop
					// no need to loop the rest iterations
					break;
				}
			}
			// if current startRange value is not found in the arrayList we assign it's
			// value to the missingNum
			if (!found) {
				missingNum = startRange;
				// we found the missing number no need to loop the rest iterations
				break;
			}
		}

		return missingNum;

	}

}
