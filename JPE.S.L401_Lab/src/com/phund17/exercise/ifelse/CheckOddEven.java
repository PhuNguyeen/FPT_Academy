package com.phund17.exercise.ifelse;

import java.util.Scanner;

/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Lab 401
 */

public class CheckOddEven {
	public static void main(String[] args) { // Program entry point

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value for number: ");
		int number = scanner.nextInt();

		System.out.println("The number is " + number);
		if (number % 2 == 0) {
			System.out.println("Even Number"); // even number
		} else {
			System.out.println("Odd Number"); // odd number
		}
		System.out.println("---------------------");
		System.out.println("Bye");

		scanner.close();

	}
}