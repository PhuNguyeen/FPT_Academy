package com.fsoft.phund17.exercise3;

import java.util.Scanner;

/*
Name:Nguyen Duc Phu
Date:11/01/2022
*/
public class FrequentNumber {
	public static void main(String[] args) {

		int value, len, index = 0, dem = 0;
		String n = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("User to enter length of Array: ");
		len = sc.nextInt();

		System.out.println("Enter an int value: ");
		value = sc.nextInt();

		int[] arr = new int[len];
		System.out.println("Enter elements of Array: ");

		int i = 0;
		do {
			arr[i] = sc.nextInt();
			if (arr[i] == value) {
				dem++;
				// index = i;
			}

			i++;

		} while (i < len);
		System.out.println(" Amount of frequence: " + dem);

		int j = 0;
		System.out.print("Indexs: ");
		do {
			if (arr[j] == value) {
				index = j;
				System.out.print(index + " ");
			}
			
			j++;
			
		} while (j < len);

		sc.close();
	}
}
