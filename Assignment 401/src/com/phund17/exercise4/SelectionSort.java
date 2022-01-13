package com.phund17.exercise4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Assignment 401
 */
public class SelectionSort extends NumberList implements Sort {
	
	
	public SelectionSort(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int min = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min])
					min = j;

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	public void print() {
		System.out.println(Arrays.toString(arr) + " Selection Sort");
	}

	public static void main(String args[]) {
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap chi so mang: ");
		n = sc.nextInt();
		SelectionSort ob = new SelectionSort(n);
		ob.input(n);
		ob.sort();
		System.out.println("Sorted array");
		ob.print();

		sc.close();
	}

}
