package com.phund17.exercise;

/**
 * Name:Nguyen Duc Phu Date:11/01/2022 Lab 301
 */
public class MultiDimensionArrayDemo {
	public static void main(String[] args) {
		int[][] matrix = new int[2][2]; // create a multi dimension array that has 2 rows and 2 columns.
		matrix[0][0] = 1;// set value for element at row: 1, column: 1
		matrix[0][1] = 2;// set value for element at row: 1, column: 2
		matrix[1][0] = 3;// set value for element at row: 2, column: 1
		matrix[1][1] = 4;// set value for element at row: 2, column: 2
		// access array element at a given index to get value.
		System.out.println("Element at second row and first column is: " + matrix[1][0]);
		System.out.println("Number of row: " + matrix.length); // Get number of rows of array
		System.out.println("Number of columns: " + matrix[0].length); // Get number of columns of array
	}
}
