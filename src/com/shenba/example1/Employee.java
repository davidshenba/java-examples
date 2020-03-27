package com.shenba.example1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private String doj;
	private String empId;
	private String department;
	
	//this method uses old school way of doing date comparison
	public int seniorEmployee(String doj1, String doj2, String dateFormat) {
		DateFormat df = new SimpleDateFormat(dateFormat);
		Date dojdt1;
		Date dojdt2;
		try {
			dojdt1 = df.parse(doj1);
			dojdt2 = df.parse(doj2);
		} catch (ParseException e) {
			return 0;
		}
		return dojdt1.compareTo(dojdt2);
	}
	
	/**
	 * @return the doj
	 */
	public String getDoj() {
		return doj;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(String doj) {
		this.doj = doj;
	}
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
