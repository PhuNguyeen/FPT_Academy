package com.phund17.exercise3;
/**
 * Name:Nguyen Duc Phu 
 * Date:12/01/2022 
 * Assignment 401
 */
public class Truck extends Car implements SalePrice {

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public double getSalePrice() {
		if (weight > 2000) {
			this.regularPrice = regularPrice * 0.1;
		} else {
			this.regularPrice = regularPrice * 0.2;
		}
		return this.regularPrice;
	}

	@Override
	public String toString() {
		System.out.println("Truck [speed=" + speed + ", regularPrice=" + regularPrice
				+ ", color=" + color + ", weight=" + weight + "]");
		return super.toString();
	}

}
