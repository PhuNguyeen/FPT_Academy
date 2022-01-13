package com.phund17.exercise2;
/**
 * Name:Nguyen Duc Phu 
 * Date:12/01/2022 
 * Assignment 401
 */

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("Phu", "Nguyen", 5.0);
		employee.print();
		Employee employee1 = new Employee("An", "Nguyen1", 6.0);
		employee1.print();
		System.out.println("Sau tang luongw:");
		employee.setMonthlySalary(employee.getMonthlySalary());
		employee.print();
		employee1.setMonthlySalary(employee1.getMonthlySalary());
		employee1.print();
		

	}
}
