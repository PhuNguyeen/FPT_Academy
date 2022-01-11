package com.fsoft.phund17.exercise4;

import java.util.Scanner;

/*
Name:Nguyen Duc Phu
Date:11/01/2022
*/
public class ArrayReverse {
	public static void main(String[] args) {
		int len;

		Scanner sc = new Scanner(System.in);
		System.out.print("User to enter length of Array: ");
		len = sc.nextInt();

		int[] arr = new int[len];
		System.out.println("Enter elements of Array: ");

		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("  Original Array: ");
		for (int i = 0; i < len; i++) {
			if (i != 0) {
				System.out.print(",");
			}
			System.out.print(arr[i]);
		}
		System.out.print("\nReversed Array: ");
		for (int i = len; i > 0; i--) {
			if (i != len) {
				System.out.print(",");
			}
			System.out.print(arr[i - 1]);
		}

		sc.close();
	}

}
