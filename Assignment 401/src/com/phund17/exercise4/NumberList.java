package com.phund17.exercise4;

/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Assignment 401
 */
import java.util.Scanner;

public class NumberList {
	public static int[] arr;


	public NumberList(int n) {
		arr = new int[n];
	}

	public void input(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu mang:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
	}

	public void print() {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
