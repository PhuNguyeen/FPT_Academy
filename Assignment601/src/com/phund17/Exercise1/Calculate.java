/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 17, 2022
*	Assignment 601
*
*/
package com.phund17.Exercise1;

public class Calculate {
//	private double weight;
//	private double height;

	// function 1
	public double calculate(double a, Operator operator, double b) {

		double result = 0;
		switch (operator) {
		case ADD: {
			result = a + b;
			break;
		}
		case SUB: {
			result = a - b;
			break;
		}
		case MUL: {
			result = a * b;
			break;
		}
		case DIV: {
			result = a / b;
			break;
		}
		case POW: {
			result = Math.pow(a, b);
			break;
		}
		case EQUAL: {
			
			break;
		}
		}
		return result;
	}

	// function 2
	public BMI calculateBMI(double weight, double height) {
		height = height / 100;
		double calBMI = weight / (height * height);
		System.out.println("BMI Number: " + calBMI);
		if (calBMI < 19) {
			return BMI.DUOI_CHUAN;
		}
		if (calBMI < 25) {
			return BMI.CHUAN;
		}
		if (calBMI < 30) {
			return BMI.THUA_CAN;
		}
		if (calBMI < 40) {
			return BMI.BEO;
		}
		return BMI.RAT_BEO;
	}

}
