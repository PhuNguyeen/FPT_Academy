package com.fsoft.phund17;

import java.util.Scanner;

/*
	Name:Nguyen Duc Phu
Date:10/01/2022
*/
public class CylinderComputation {

	public static void main(String[] args) {
		double radius, height, surfaceArea, baseArea, volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("radius: ");
		radius = sc.nextDouble();
		System.out.println("height: ");
		height = sc.nextDouble();
		surfaceArea = 2 * Math.PI * height * radius;
		baseArea = Math.PI * radius * radius + Math.PI * 2 * radius * radius;
		volume = Math.PI * height * radius * radius;
		System.out.println("Surface area = " + surfaceArea);
		System.out.println("Base area = " + baseArea);
		System.out.println("Volume = " + volume);

		sc.close();
	}

}
