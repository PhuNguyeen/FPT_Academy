/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 16, 2022
*	Assignment 501
*
*/
package com.PhuND17.Exercise1;

import java.util.Scanner;

public class Tron implements Shape {

	double radius;
	double perimeter = 0;
	double area = 0;
	
	public void input(Scanner sc) {
		
		System.out.println("Pleace input sradius of Circle:");
		radius = sc.nextDouble();
		//sc.close();
	}

	@Override
	public void getPerimeter() {
		perimeter = 2 * Math.PI * radius;
	}

	@Override
	public void getArea() {
		area = Math.PI * radius * radius;
		
	}
	@Override
	public void printResult() {
		System.out.println("Radius: "+ radius);
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}

}
