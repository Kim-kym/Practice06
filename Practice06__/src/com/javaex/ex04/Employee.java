package com.javaex.ex04;

public class Employee extends User {
	private int salary;

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	public int getEmployee() {
		return salary;
	}
	public void setEmployee(int salary) {
		this.salary = salary;
	}
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s, #월급:%s%n"
				, id, password, name, salary);
		System.out.printf("운영자의 월급은 %s원 입니다.", salary);
	}

	
}
