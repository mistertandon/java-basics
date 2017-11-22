package com.mistertandon.core.java.operators;

public class A00200Vargs {

	public static void main(String[] args) {

		Display displayObj = new Display();

		displayObj.show(34, 97, 102);
		displayObj.show(876);

	}
}

class Display {

	public void show(int... digitsArr) {

		for (int digits : digitsArr) {

			System.out.println("Passed arguments is: " + digits);
		}
	}

	public void show(int digit) {

		System.out.println("Passed arguments is digit: " + digit);
	}
}
