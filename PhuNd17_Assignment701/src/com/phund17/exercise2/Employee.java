/**
* 
*	author: KEN
*	date   Jan 23, 2022
*	Lab/Assignment
*
*/
package com.phund17.exercise2;

public abstract class Employee implements Payable {
	public String ssn;
	public String firstName;
	public String lastName;
	public String birthDate;
	public String phone;
	public String email;
    
	public Employee() {
		super();
	}

	public Employee(String ssn, String firstName, String lastName) {
		super();
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void display() {
		System.out.println("Employee [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", phone=" + phone + ", email=" + email + "]");
	}
    
    
}
