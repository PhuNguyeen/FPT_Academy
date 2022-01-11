package com.fsoft.phund17.exercise1;

import java.util.Scanner;

/*
Name:Nguyen Duc Phu
Date:11/01/2022
*/
public class Exercise1 {
	public static void main(String[] args) {
		int s = 0, avg = 0, n, m;
		Scanner sc = new Scanner(System.in);
		System.out.print("From: ");
		m = sc.nextInt();
		System.out.print("To: ");
		n = sc.nextInt();
		for (int i = m; i <= n; i++) {
			s += i;
			avg = s / i;
		}
		System.out.println("Average of all 100 first numbers: " + avg);
		
		sc.close();
	}
}
