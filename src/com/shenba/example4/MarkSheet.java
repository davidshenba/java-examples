package com.shenba.example4;

public class MarkSheet {
	
	private String regNo;
	private int mark1, mark2, mark3;
	
	/**
	 * @return the regNo
	 */
	public String getRegNo() {
		return regNo;
	}
	/**
	 * @param regNo the regNo to set
	 */
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	/**
	 * @return the mark1
	 */
	public int getMark1() {
		return mark1;
	}
	/**
	 * @param mark1 the mark1 to set
	 */
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	/**
	 * @return the mark2
	 */
	public int getMark2() {
		return mark2;
	}
	/**
	 * @param mark2 the mark2 to set
	 */
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	/**
	 * @return the mark3
	 */
	public int getMark3() {
		return mark3;
	}
	/**
	 * @param mark3 the mark3 to set
	 */
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	
	public MarkSheet() {
		this.regNo = String.valueOf((int)(999999 * Math.random())); 
		this.mark1 =(int)(99 * Math.random()); 
		this.mark2 =(int)(99 * Math.random()); 
		this.mark3 =(int)(99 * Math.random()); 
	}
}
