package com.phund17.exercise4;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Assignment 401
 */
public class InsertSort extends NumberList implements Sort {

	public InsertSort(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

	public void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public void print() {
		System.out.println(Arrays.toString(arr) + " Insertion Sort");
	}

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap chi so mang: ");
		n = sc.nextInt();

		InsertSort ob = new InsertSort(n);
		ob.input(n);

		ob.sort(arr);
		System.out.println("Sorted array");
		ob.print();

		sc.close();
	}

}
