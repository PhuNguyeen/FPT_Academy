/**
* 
*	author: Nguyến Đức Phú
*	date   Jan 20, 2022
*	Assignment 601
*
*/
package com.phund17.Exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManageEastAsiaCountries{

	EastAsiaCountries asiaCountries = new EastAsiaCountries();
	Scanner sc = new Scanner(System.in);
	
	ArrayList<EastAsiaCountries> list = new ArrayList<EastAsiaCountries>();
	
	public void menu() {
		
		System.out.println("               					Menu  			    	           ");
		System.out.println("===================================================================");
		System.out.println("1. Input the information of 11 countries in East Asia");
		System.out.println("2. Display the information of country you've just input");
		System.out.println("3. Search the information of country by user-entered name");
		System.out.println("4. Display the information of countries sorted name in ascending");
		System.out.println("5. Exit");
		System.out.println("====================================================================");

		while (true) {
			Integer option;
			System.out.println("Please choice one option: ");
			String strOption = sc.next();
			try {
				option = Integer.parseInt(strOption);
				switch (option) {
				case 1:
					addCountryInformation(asiaCountries);
					break;
				case 2:
					getRecentlyEnteredInformation();
					break;
				case 3:
					String name = inputCountryName();
					searchInformationByName(name);
					break;
				case 4:
					sortInformationByAscendingOrder();
					break;
				case 5:
					System.exit(option);
					break;
				}

			} catch (Exception e) {
				System.err.println("Please enter option number in menu! ");
			}
		}
	}

	public void addCountryInformation(EastAsiaCountries country) throws Exception {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter code of country " + i + " : ");
			country.countryCode = sc.next();
			System.out.println("Enter name of country " + i + " : ");
			String countryName = sc.next();
			System.out.println("Enter total Area " + i + " : ");
			float totalArea = sc.nextFloat();
			System.out.println("Enter terrain of country " + i + " : ");
			String countryTerrain = sc.next();
			list.add(new EastAsiaCountries(country.countryCode, countryName, totalArea, countryTerrain));
		}

	}

	public EastAsiaCountries getRecentlyEnteredInformation() throws Exception {
		System.out.format("%10s%15s%15s%15s", "ID", "Name", "Total Area", "Terrain");
		for (EastAsiaCountries a : list) {
			a.display();
		}
		return asiaCountries;
	}

	public String inputCountryName() {
		System.out.print("Enter the name you want to search for: ");
		String name = sc.next();
		return name;
	}

	public EastAsiaCountries[] searchInformationByName(String name) throws Exception {
		System.out.format("%10s%15s%15s%15s", "ID", "Name", "Total Area", "Terrain");
		EastAsiaCountries[] eastAsiaCountries = new EastAsiaCountries[list.size()];
		int index=0 ;
		for (EastAsiaCountries country : list) {
			if (country.getCountryName().equals(name)) {
				eastAsiaCountries[index] = country;
				country.display();
			}
		}
		return eastAsiaCountries;
	}

	public EastAsiaCountries[] sortInformationByAscendingOrder() throws Exception {
		System.out.format("%10s%15s%15s%15s", "ID", "Name", "Total Area", "Terrain");
		Collections.sort(list);
		for (EastAsiaCountries a : list) {
			a.display();
		}
		return null;
	}
}
