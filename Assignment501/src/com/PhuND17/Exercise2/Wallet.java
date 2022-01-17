/**
* 
author: Nguyễn Đức Phú
*	date   Jan 17, 2022
*	Assignment 501
*
*/
package com.PhuND17.Exercise2;

import java.util.Scanner;

public class Wallet extends Person {
	int wallet;

	
	public void inputWallet(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input value of wallet: ");
		wallet = sc.nextInt();
	}

	public boolean payMoney(int total) {
		total = this.total;
		if (wallet >= total) {
			System.out.println("You can buy it.");
		} else {
			System.out.println("You can't buy it.");
		}
		return true;
	}
}
