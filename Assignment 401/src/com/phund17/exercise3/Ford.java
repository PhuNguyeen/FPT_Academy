package com.phund17.exercise3;
/**
 * Name:Nguyen Duc Phu 
 * Date:12/01/2022 
 * Assignment 401
 */
public class Ford extends Car implements SalePrice {

	public Ford(int speed, double regularPrice, String color, int manufacturerDiscount, int year) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	int year;

	int manufacturerDiscount;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}

	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}

	@Override
	public double getSalePrice() {
		this.regularPrice = regularPrice - manufacturerDiscount;
		return this.regularPrice;
	}

	public void printFord() {
		System.out.println("Ford [speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color + ", year="
				+ year + ", manufacturerDiscount=" + manufacturerDiscount + "]");
	}

}
