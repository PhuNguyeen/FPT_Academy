package com.fsoft.phund17;

import java.util.Scanner;

public class RectangleExercise {
	double Width, Height;

	public void Area() {
		System.out.println("Area is" + Width + "*" + Height + " = " + Width * Height);
	}

	public void Perimeter() {
		System.out.println("Perimeter is" + Width + "*" + Height + " = " + 2 * (Width + Height));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		RectangleExercise re = new RectangleExercise();
		re.Height = sc.nextDouble();
		re.Width = sc.nextDouble();

		re.Area();
		re.Perimeter();

		sc.close();
	}
}
