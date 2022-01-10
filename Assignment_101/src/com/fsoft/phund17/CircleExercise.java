package com.fsoft.phund17;

import java.util.Scanner;

public class CircleExercise {
	double Radius;

	public void Perimeter() {
		 System.out.println( "Area is = " +2 * Math.PI * Radius);
		return;
	}

	public void Area() {
		System.out.println("Perimeter is = " +Math.PI * Radius * Radius);
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CircleExercise cE =new CircleExercise();
		cE.Radius = sc.nextDouble();
		cE.Perimeter();
		cE.Area();
		sc.close();
	}
}
