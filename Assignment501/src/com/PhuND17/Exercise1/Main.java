/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 17, 2022
*	Assignment 501
*
*/
package com.PhuND17.Exercise1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== Calculator Shape Progarmer ========");
		ChuNhat cn1 = new ChuNhat();
		cn1.input(sc);
		
		Tron tron = new Tron();
		tron.input(sc);	
		
		TamGiac tg = new TamGiac();
		tg.input(sc);
		
		cn1.getArea();
		cn1.getPerimeter();
		System.out.println("-------- Rectangle --------");
		cn1.printResult();
		
			
		tron.getArea();
		tron.getPerimeter();
		System.out.println("-------- Circle --------");
		tron.printResult();
			

		tg.getArea();
		tg.getPerimeter();
		System.out.println("-------- Triangle --------");
		tg.printResult();
	}

}
