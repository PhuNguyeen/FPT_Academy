/**
* 
*	author: Nguyến Đức Phú
*	date   Jan 20, 2022
*	Assignment 601
*
*/
package com.phund17.Exercise2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
//		System.out.format("%10s%15s%15s%15s","ID", "Name","Total Area","Terrain");
		Scanner sc = new Scanner(System.in);
		Integer option;
		ManageEastAsiaCountries mec = new ManageEastAsiaCountries();
		mec.menu();
	}
}
