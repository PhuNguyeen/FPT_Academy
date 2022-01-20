/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 20, 2022
*	Assignment 601
*
*/
package com.phund17.Exercise2;

public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries> {
	private String countryTerrain;

	public EastAsiaCountries() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
		super(countryCode, countryName, totalArea);
		this.countryTerrain = countryTerrain;
	}

	public String getCountryTerrain() {
		return countryTerrain;
	}

	public void setCountryTerrain(String countryTerrain) {
		this.countryTerrain = countryTerrain;
	}

	@Override
	public void display() {
		System.out.format("\n%10s%15s%15s%15s\n", countryCode, countryName, totalArea, countryTerrain);

	}

	@Override
	public int compareTo(EastAsiaCountries o) {
		return this.getCountryName().compareTo(o.getCountryName());
	}
}
