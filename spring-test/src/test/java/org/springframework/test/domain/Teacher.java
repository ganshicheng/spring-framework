package org.springframework.test.domain;

public class Teacher extends User{

	@Override
	public void showMe() {
		System.out.println("i am teacher");
	}
}
