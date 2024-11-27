package com.bptn.leetcode_challenege_section_3_team3.leetcode.challenge1;

public class AverageSalary {

	public double average(int[] salaries) {
		// Initialize variables
		// assume maxSalary is the first index value
		int maxSalary = salaries[0];
		// assume minSalary is the second index value
		int minSalary = salaries[1];
		int sum = 0;
		double averageSalary = 0.0;

		// Find the sum, max, and min
		for (int salary : salaries) {
			sum += salary;
			if (salary > maxSalary) {
				maxSalary = salary;
			}
			if (salary < minSalary) {
				minSalary = salary;
			}
		}

		// Subtract max and Min from the sum and calculate the average
		averageSalary = (sum - (maxSalary + minSalary)) / (double) (salaries.length - 2);
		return averageSalary;

	}
}
