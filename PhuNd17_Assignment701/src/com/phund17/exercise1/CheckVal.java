/**
* 
*	author: KEN
*	date   Jan 21, 2022
*	Lab/Assignment
*
*/
package com.phund17.exercise1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CheckVal {

	String regexEmail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	final static String DATE_FORMAT = "dd/MM/yyyy";

	public String checkPhone(String phoneNumber) {

		if (phoneNumber.matches("^(0)?[0-9]{9}$") || phoneNumber.matches("^(\\+\\d{2}( )?)?[0-9]{9}$")) {
			return (phoneNumber);
		} else if (!phoneNumber.matches("^[0-9]*$")) {
			return "Phone number must is number!";
		} else if (phoneNumber.length() < 10 || phoneNumber.length() > 10) {
			return "Phone number must be 10 digits!";
		} else if (phoneNumber.matches("^[0-9]{10}$")) {
			return "Phone number of VN must start 0 or +84";
		}
		return phoneNumber;
	}

	public String checkEmail(String email) {

		if (email.matches(regexEmail)) {
			return email;
		} else {
			return "Email must is correct format!";
		}

	}

	public String isDateValid(String date) {

		try {

			DateFormat df = new SimpleDateFormat(DATE_FORMAT);
			df.setLenient(false);
			df.parse(date);
			return date;

		} catch (Exception e) {
			return "Date to correct format(dd/mm/yyy)!";

		}

	}

}
