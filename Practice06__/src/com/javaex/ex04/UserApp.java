package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] userArray = new User[3];
		
		for(int i = 0; i < userArray.length; ++i) {
			switch(i) {
			case 1 :
				Customer j = new Customer("jws", "j1234", "정우성", 1000);
				userArray[i] = j;
			break;
			case 2 : 
				Customer y = new Customer("yjs", "y1234", "이효리", 2000);
				userArray[i] = y;
			break;
			case 3 : 
				Employee m = new Employee("master", "m7708", "운영자", 500);
				userArray[i] = m;
			break;
			}
		for(int r = 0; r < userArray.length; ++r) {
			System.out.println(userArray[r]);
			}
//			Employee s = new Employee(5000));
//			s.showInfo();
		}
			
		}

	}

