package com.phund17.exercise2;
/**
 * Name:Nguyen Duc Phu 
 * Date:12/01/2022 
 * Assignment 401
 */

public class Employee {
	String firstName;
	String lastName;
	double monthlySalary;

	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary < 0) {
			this.monthlySalary = 0;
		} else {
			this.monthlySalary = monthlySalary * 0.1 + monthlySalary;
		}
	}
	
	public String print() {
		System.out.println("Name: " + this.firstName + " " + this.lastName);
		System.out.println("Monthly salary: " +  this.monthlySalary);
		return super.toString();
	}
	
}
