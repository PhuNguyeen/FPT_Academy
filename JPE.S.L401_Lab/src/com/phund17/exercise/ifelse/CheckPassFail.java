package com.phund17.exercise.ifelse;

import java.util.Scanner;

/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Lab 401
 */
public class CheckPassFail {
	public static void main(String[] args) { // Program entry point

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value for number: ");
		int mark = scanner.nextInt();

		System.out.println("The mark is " + mark);

		// if-else statement
		if (mark >= 50) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("--------------------");
		System.out.println("CHECK DONE");
		
		scanner.close();
	}
}