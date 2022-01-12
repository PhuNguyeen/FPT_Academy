package com.phund17.exercise.whileloop;

/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Lab 401
 */

public class Fibonacci {
	public static void main(String[] args) {

		int n = 1; // The index n for F(n)
		int fnMinus1 = 1; // F(n-1), init to F(2)
		int fnMinus2 = 1; // F(n-2), init to F(1)
		int nMax = 20; // maximum n, inclusive
		int sum = fnMinus1 + fnMinus2; // Need sum to compute average
		double average;

		System.out.println("The first " + nMax + " Fibonacci numbers are:");

		while (n <= nMax) {
			System.out.print(fnMinus1 + " ");
			// Compute F(n), print it and add to sum
			// Increment the index n and shift the numbers for the next iteration

			sum = fnMinus1 + fnMinus2;

			fnMinus1 = fnMinus2;
			fnMinus2 = sum;

			++n;
		}

		// Compute and display the average (=sum/nMax) .
		average = sum / nMax;
		// Beware that int/int gives int.
		System.out.println("\n The average is " + average);
	}
}
