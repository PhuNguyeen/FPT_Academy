/**
* 
*	author: KEN
*	date   Jan 23, 2022
*	Lab/Assignment
*
*/
package com.phund17.exercise2;

import java.util.List;

public class Department {
	private String departmentName;
	private List<Department> listOfEmployee;

	SalariedEmployee salariedEmployee = new SalariedEmployee();
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void dipaly() {
		//return "Department [departmentName=" + departmentName + ", listOfEmployee=" + listOfEmployee + "]";
	}



	
}
