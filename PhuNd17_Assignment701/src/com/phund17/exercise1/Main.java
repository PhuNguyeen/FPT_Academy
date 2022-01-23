/**
* 
*	author: KEN
*	date   Jan 23, 2022
*	Lab/Assignment
*
*/
package com.phund17.exercise1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String phoneNumber;
		String email;
		String date;
		String check;

		Scanner sc = new Scanner(System.in);

		CheckVal checkVal = new CheckVal();

		System.out.print("Phone number: ");
		phoneNumber = sc.nextLine();
		while ((check = checkVal.checkPhone(phoneNumber)) != null) {
			if (check == phoneNumber) {
				break;
			}
			System.out.println(check);
			System.out.print("Phone number: ");
			phoneNumber = sc.nextLine();
		}

		System.out.print("Email: ");
		email = sc.nextLine();
		while ((check = checkVal.checkEmail(email)) != null) {
			if (check == email) {
				break;
			}
			System.out.println(check);
			System.out.print("Email: ");
			phoneNumber = sc.nextLine();
		}

		System.out.println("Date: ");
		date = sc.nextLine();
		while ((check = checkVal.isDateValid(date)) != null) {
			if (check == date) {
				break;
			}
			System.out.println(check);
			System.out.print("Data: ");
			phoneNumber = sc.nextLine();
		}

		sc.close();
	}
}
