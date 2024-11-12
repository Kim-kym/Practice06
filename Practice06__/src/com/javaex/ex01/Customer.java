package com.javaex.ex01;

public class Customer extends Person{
	
	private int cNo;
	private int point;
	
//	public Customer(int cNo, int point) {
//		this.cNo = cNo; 
//		this.point = point;
//	}
	public int getCNo() {
		return cNo;
	}
	public void setCNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	
}
