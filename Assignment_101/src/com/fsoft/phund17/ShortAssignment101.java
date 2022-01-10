package com.fsoft.phund17;

/*
 	Name:Nguyen Duc Phu
	Date:10/01/2022
*/
public class ShortAssignment101 {
	public static void main(String[] args) {
		// ArithmeticExercise1
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		System.out.println("-------------------");
		// ArithmeticExercise2
		int a = 125, b = 24;
		System.out.println(a + "+" + b + " = " + (a + b));
		System.out.println(a + "-" + b + " = " + (a - b));
		System.out.println(a + "x" + b + " = " + (a * b));
		System.out.println(a + "/" + b + " = " + (a / b));
		System.out.println(a + "%" + b + " = " + (a % b));
		System.out.println("-------------------");
		// ArithmeticExercise3
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		System.out.println("-------------------");
		// JavaExercise
		System.out.println("   J    a   v     v  a    \n" 
						 + "   J   a a   v   v  a a   \n"
						 + "J  J  aaaaa   V V  aaaaa   \n" 
						 + " JJ  a     a   V  a     a" );
		System.out.println("-------------------");
		// LogicalExercise

		int a1 = 25, a2 = 39;
		
		if (a1 != a2) {
			System.out.println("25 != 39");
		}if (a1 < a2) {
			System.out.println("25 < 39 ");
		}
		if (25 <= 39) {
			System.out.println("25 <= 39");
		}
	}
}
