package org.springframework.test.domain;

public class Student extends User{

	@Override
	public void showMe() {
		System.out.println("i am student");
	}
}
