/**
* 
*	author: KEN
*	date   Jan 23, 2022
*	Lab/Assignment
*
*/
package com.phund17.exercise2;

public class HourlyEmployee extends Employee {
	public double wage;// tỷ lệ
	public double workingHours; // giơ làm việc

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", workingHours=" + workingHours + "]";
	}
	

}
