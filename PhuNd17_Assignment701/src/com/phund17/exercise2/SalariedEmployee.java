/**
* 
*	author: KEN
*	date   Jan 23, 2022
*	Lab/Assignment
*
*/
package com.phund17.exercise2;

public class SalariedEmployee extends Employee {
	public double commissionRate; // thưởng
	public double grossSale;// tổng doanh số
	public double basicSalary; // lương cơ bản

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(double commissionRate, double grossSale, double basicSalary) {
		super();
		this.commissionRate = commissionRate;
		this.grossSale = grossSale;
		this.basicSalary = basicSalary;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [commissionRate=" + commissionRate + ", grossSale=" + grossSale + ", basicSalary="
				+ basicSalary + "]";
	}

}
