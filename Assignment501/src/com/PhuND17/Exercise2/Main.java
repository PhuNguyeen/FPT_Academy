/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 17, 2022
*	Assignment 501
*
*/
package com.PhuND17.Exercise2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		Wallet w = new Wallet();
		System.out.print("Input number of bills: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		w.input(n);
		w.inputWallet(n);
		w.payMoney(w.calcTotal(null));

	}
}
