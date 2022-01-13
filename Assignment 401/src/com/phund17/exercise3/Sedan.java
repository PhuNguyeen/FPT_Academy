package com.phund17.exercise3;
/**
 * Name:Nguyen Duc Phu 
 * Date:12/01/2022 
 * Assignment 401
 */
public class Sedan extends Car implements SalePrice {

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public double getSalePrice() {
		if (length > 20) {
			this.regularPrice = regularPrice * 0.05 + regularPrice;
		} else {
			this.regularPrice = regularPrice * 0.1 + regularPrice;
		}
		return this.regularPrice;
	}

	@Override
	public String toString() {
		System.out.println("Sedan [speed=" + speed + ", regularPrice=" + regularPrice
				+ ", color=" + color + ", length=" + length + "]");
		return super.toString();
	}

}
