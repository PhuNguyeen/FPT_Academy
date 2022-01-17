/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 16, 2022
*	Assignment 501
*
*/
package com.PhuND17.Exercise1;

import java.util.Scanner;

public class TamGiac implements Shape {
	double sideA, sideB, sideC;
	double perimeter = 0;
	double area = 0;

	public void input(Scanner sc) {
		
		System.out.println("Pleace input side A of Triangle:");
		sideA = sc.nextDouble();
		System.out.println("Pleace input side B of Triangle:");
		sideB = sc.nextDouble();
		System.out.println("Pleace input side C of Triangle:");
		sideC = sc.nextDouble();
		
	}

	@Override
	public void getPerimeter() {
		perimeter = sideA + sideB + sideC;
	}

	@Override
	public void getArea() {
		double p = (sideA + sideB + sideC) / 2;
		area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

	}

	@Override
	public void printResult() {
		System.out.println("Side A: " + sideA);
		System.out.println("Side B: " + sideB);
		System.out.println("Side C: " + sideC);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}
