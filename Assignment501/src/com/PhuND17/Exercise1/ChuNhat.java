/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 16, 2022
*	Assignment 501
*
*/
package com.PhuND17.Exercise1;

import java.util.Scanner;

public class ChuNhat implements Shape {

	double width, length;
	double perimeter = 0;
	double area = 0;

	public void input(Scanner sc) {
		
		System.out.println("Pleace input side width of Rectangle:");
		width = sc.nextDouble();
		System.out.println("Pleace input side length of Rectangle:");
		length = sc.nextDouble();
		
	}

	@Override
	public void getPerimeter() {
		perimeter = 2 * (width + length);

	}

	@Override
	public void getArea() {
		area = width * length;

	}

	@Override
	public void printResult() {
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);

	}

}
