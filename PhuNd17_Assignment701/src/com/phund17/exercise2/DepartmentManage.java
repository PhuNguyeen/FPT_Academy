/**
* 
*	author: KEN
*	date   Jan 23, 2022
*	Lab/Assignment
*
*/
package com.phund17.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentManage {
	public static void main(String[] args) {
		DepartmentManage department = new DepartmentManage();
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		department.addS(salariedEmployee);
	}
	SalariedEmployee salariedEmployee = new SalariedEmployee();
	Department department = new Department();

	ArrayList<SalariedEmployee> listSalariedEmployees = new ArrayList<SalariedEmployee>();

	ArrayList<HourlyEmployee> listHourlyEmployees = new ArrayList<HourlyEmployee>();

	public void addS(SalariedEmployee salariedEmployee) {
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < 2; index++) {
			salariedEmployee.ssn = sc.next();
			salariedEmployee.firstName = sc.next();
			salariedEmployee.lastName = sc.next();
			salariedEmployee.birthDate = sc.next();
			salariedEmployee.phone = sc.next();
			salariedEmployee.email = sc.next();
			salariedEmployee.commissionRate = sc.nextDouble();
			salariedEmployee.grossSale = sc.nextDouble();
			salariedEmployee.basicSalary = sc.nextDouble();

			listSalariedEmployees.add(new SalariedEmployee());

		}
	}
	public SalariedEmployee showS() {
		for (SalariedEmployee salariedEmployee : listSalariedEmployees) {
			salariedEmployee.toString();
		}
		return salariedEmployee;
		
	}

}
