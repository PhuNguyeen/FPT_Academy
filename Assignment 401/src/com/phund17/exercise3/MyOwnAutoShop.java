package com.phund17.exercise3;
/**
 * Name:Nguyen Duc Phu 
 * Date:12/01/2022 
 * Assignment 401
 */
public class MyOwnAutoShop {
	public static void main(String[] args) {
		Car car = new Car(300, 12000, "Red");
		car.printCar();

		Ford ford = new Ford(200, 34000, "Black", 4000, 2018);
		ford.printFord();
		System.out.println("Sale Price: " + ford.getSalePrice());
		
		Truck truck = new Truck(150, 10000, "Gray", 2500);
		truck.toString();
		System.out.println("Sale Price: " + truck.getSalePrice());
		
		Sedan sedan = new Sedan(330, 25000, "White", 30);
		sedan.toString();
		System.out.println("Sale Price: " + sedan.getSalePrice());
		
	}

}
