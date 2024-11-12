package com.javaex.ex04;

public class User {
	protected String id;
	protected String password;
	protected String name;
	
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id; 
	}
	public String getPassword() {
		return password;
	}
	public void setNmae(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public void showInfo() {
		System.out.printf("#아이디:%s, #패스워드:%s, #이름:%s%n", id, password, name);
	}

}
