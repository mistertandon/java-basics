package com.mistertandon.core.java.oops.concept;

public class A0130ThisKeyword {

	public static void main(String[] args) {

		Student studentObj = new Student(4);
		studentObj.displayAge();
	}

}

class Student {

	public int age;

	public Student(int age) {

		this.age = age;
	}

	public void displayAge() {

		System.out.println("Student AGE is: " + age);
	}
}
