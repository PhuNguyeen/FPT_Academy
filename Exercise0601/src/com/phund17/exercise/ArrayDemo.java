package com.phund17.exercise;

/**
 * Name:Nguyen Duc Phu Date:11/01/2022 Lab 301
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// declare an array
		int[] arrayInt = new int[7];
		// set value for each element of array.
		arrayInt[0] = 1;
		arrayInt[1] = 2;
		arrayInt[2] = 3;//~ int[] arrayInt = {1, 2, 3, 4, 5);
		arrayInt[3] = 4;
		arrayInt[4] = 5;
		// get array length
		System.out.println("Array length: " + arrayInt.length);
		// access array element at a given index to get value.
		System.out.println("Element at index 3 is: " + arrayInt[5]);
		/*
		 * 1. Khai báo một mảng có kích thước là 7
		 * 2. Nếu kích thước mảng là 7 thì sẽ in ra 0 vì tại arrayInt[5] chưa được khai báo. 
		 * Còn nếu kích thước mảng là 5 thì sẽ báo lỗi java.lang.ArrayIndexOutOfBoundsException
		 * vì trong java sẽ sử dụng zero-based indexing nghĩa là chỉ số mảng trong array
		 * bắt đầu từ 0 và kết thúc là kích thước mảng -1.
		 */
	}
}
