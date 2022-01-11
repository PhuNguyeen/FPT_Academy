package com.fsoft.phund17.exercise2;

import java.util.Scanner;

/*
Name:Nguyen Duc Phu
Date:11/01/2022
*/
public class ArrayContains {
	public static void main(String[] args) {
		// String[] stringArray = { "FPT", "Fresher", "Acedemy", "2018" };
		String[] stringArray = new String[5];
		String sValue;
		int dem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("stringArray: ");
		for (int i = 0; i < 4; i++) {
			stringArray[i] = sc.nextLine();
		}
		System.out.print("Value: ");
		sValue = sc.nextLine();
		for (int i = 0; i < 4; i++) {
			if (sValue.equals(stringArray[i]) == true) {
				dem++;
			}
		}
		if (dem > 0) {
			System.out.println("Check " + "'" + sValue + "'" + " in Array: Contained");
		} else {
			System.out.println("Check " + "'" + sValue + "'" + " in Array: No Contain");
		}
		sc.close();

	}
}
