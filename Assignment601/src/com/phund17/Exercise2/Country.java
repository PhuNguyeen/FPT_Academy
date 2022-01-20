/**
* 
*	author: Nguyến Đức Phú
*	date   Jan 20, 2022
*	Assignment 601
*
*/
package com.phund17.Exercise2;

public class Country {
	protected String countryCode;
	protected String countryName;
	protected float totalArea;

	public Country() {
		super();
	}

	public Country(String countryCode, String countryName, float totalArea) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.totalArea = totalArea;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public float getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(float totalArea) {
		this.totalArea = totalArea;
	}

	public void display() {
		System.out.println("Country [countryCode=" + countryCode + ", countryName=" + countryName + ", totalArea="
				+ totalArea + "]");
	}

}
