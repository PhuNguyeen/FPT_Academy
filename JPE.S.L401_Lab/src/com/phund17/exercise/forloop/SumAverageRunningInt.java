package com.phund17.exercise.forloop;

/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Lab 401
 */
public class SumAverageRunningInt {
	public static void main(String[] args) {
		// Define variables
		int sum = 0; // The accumulated sum, init to 0
		double average; // average in double
		int lowerBound = 1;
		int upperBound = 100;

		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = lowerBound; number <= upperBound; ++number) {
			// The loop index variable number = 1, 2, 3, . .., 99, 100
			sum += number; // same as "sum = sum + number"
		}
		// Compute average in double. Beware that int / int produces int!

		average = sum / upperBound;

		// Print sum and average

		System.out.println("Average of all 100 first numbers: " + average);
	}
}
