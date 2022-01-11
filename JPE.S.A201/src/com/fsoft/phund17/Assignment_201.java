package com.fsoft.phund17;

import java.util.Iterator;
import java.util.Scanner;

/*
	Name:Nguyen Duc Phu
Date:10/01/2022
*/

public class Assignment_201 {
	public static void main(String[] args) {
		// Data type and Operators
		System.out.println("(101 + 0) / 3)->" + (101 + 0) / 3);
		System.out.println("(3.0e-6 * 10000000.1)->" + (3.0e-6 * 10000000.1));
		System.out.println("(true && true)->" + (true && true));
		System.out.println("(false && true)->" + (false && true));
		System.out.println("((false && false) || (true && true))->" + ((false && false) || (true && true)));
		System.out.println("(false || false) && (true && true)->" + ((false || false) && (true && true)));
		System.out.println("------------------------");

		// Logical Operators
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Input " + (i + 1) + " number: ");
			arr[i] = sc.nextInt();
			System.out.println("_________________");
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println("Numbers are equal!");
					break;
				}
				if (arr[i] != arr[j] && i != j) {
					System.out.println("Numbers are not equal!");
					break;
				}
			}
		}
		System.out.println("---------------------");
		// Arithmetic Operators
		int s = 0;
		for (int i = 0; i <= 4; i++) {
			arr[i] = sc.nextInt();
			s += arr[i];
		}
		System.out.println("The sum is " + s);
		sc.close();
	}
}
