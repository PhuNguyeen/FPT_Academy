package com.phund17.exercise4;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Name:Nguyen Duc Phu 
 * Date:11/01/2022 
 * Assignment 401
 */
public class QuickSort extends NumberList implements Sort {

	public QuickSort(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public void sort(int arr[], int low, int high) {
		if (low < high) {

			int pi = partition(arr, low, high);

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr) + " Quick Sort");
	}

	public static void main(String args[]) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap chi so mang: ");
		n = sc.nextInt();
		QuickSort ob = new QuickSort(n);
		ob.input(n);
		ob.sort(arr, 0, n - 1);

		System.out.println("sorted array");
		ob.print();
		sc.close();
	}
}
