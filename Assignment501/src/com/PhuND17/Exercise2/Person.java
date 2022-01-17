/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 17, 2022
*	Assignment 501
*
*/
package com.PhuND17.Exercise2;

import java.util.Scanner;

public class Person {
	int bills;
	int n, total = 0;

	public void input(int n) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			System.out.print("Input value of bill " + i + ": ");
			bills = sc.nextInt();
		}
	}

	public int calcTotal(int[] bills) {
		for (int i = 1; i <= n; i++) {
			total += this.bills;
		}
		return total;
	}

}
