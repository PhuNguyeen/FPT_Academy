/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 20, 2022
*	Assignment 601
*
*/
package com.phund17.Exercise1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while (true)
			menu();
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);

		Integer option;
		while (true) {
			System.out.println("------Calculator Program--------");
			System.out.println("1.Normal Calculator");
			System.out.println("2.BMI Calculator");
			System.out.println("3.Exit ");

			System.out.print("Please choice one option: ");
			String strOption = sc.next();
			try {
				option = Integer.parseInt(strOption);
				switch (option) {
				case 1: {
					calculatorNormal();
					break;
				}
				case 2: {
					calBMI();
					break;
				}
				case 3:
					System.exit(option);
					break;
				}
			} catch (Exception e) {
				System.err.println("Please enter option number in menu! ");
			}
			
		}

	}

	public static void calculatorNormal() {
		Double memory = null;
		System.out.println("-------Normal Calculator--------");
		while (true) {

			Scanner scanner = new Scanner(System.in);

			if (memory == null) {
				while (true) {
					System.out.print("Enter number: ");
					String strA = scanner.next();
					memory = checkIn(strA);

					if (memory != null) {
						break;
					}
				}
			}

			Operator o;
			while (true) {
				System.out.print("Enter Operator: ");
				String strC = scanner.next();
				o = convertStringToOperator(strC);
				if (o != null) {
					break;
				}
			}
			if (o == Operator.EQUAL) {
				break;
			}

			Double b;
			while (true) {
				System.out.print("Enter number: ");
				String strB = scanner.next();
				b = checkIn(strB);
				if (b != null) {
					break;
				}
			}
			Calculate calculator = new Calculate();
			memory = calculator.calculate(memory, o, b);
			System.out.println("Memory: " + memory);

		}
	}

	public static void calBMI() {
		Scanner scanner = new Scanner(System.in);
		Calculate calculator = new Calculate();

		System.out.println("-------BMI Calculator--------");

		Double weight;
		while (true) {

			System.out.print("Enter Weight(kg): ");
			String strA = scanner.next();
			weight = checkIn(strA);

			if (weight != null) {
				break;
			}
		}

		Double height;
		while (true) {
			System.out.print("Enter Height(cm): ");
			String strB = scanner.next();
			height = checkIn(strB);
			if (height != null) {
				break;
			}
		}

		System.out.println("BMI Status: " + calculator.calculateBMI(weight, height));
	}

	public static Double checkIn(String val) {
		Double rs = null;
		try {
			rs = Double.parseDouble(val);
		} catch (Exception e) {
			System.out.println("BMI is digit.");
		}
		return rs;
	}

	public static Operator convertStringToOperator(String input) {
		{
			if (input == null) {
				return null;
			}
			switch (input) {
			case "+": {
				return Operator.ADD;
			}
			case "-": {
				return Operator.SUB;
			}
			case "*": {
				return Operator.MUL;
			}
			case "/": {
				return Operator.DIV;
			}
			case "^": {
				return Operator.POW;
			}
			case "=": {
				return Operator.EQUAL;
			}

			}
			return null;

		}
	}

}
