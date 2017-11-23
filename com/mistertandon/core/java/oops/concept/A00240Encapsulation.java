package com.mistertandon.core.java.oops.concept;

public class A00240Encapsulation {

	public static void main(String[] args) {

		Car carObj = new Car();
		carObj.setHorsePower(1000);

		System.out.println("Car horse power value is: " + carObj.getHorsePower());
	}
}

class Car {

	private int horsePower;

	public void setHorsePower(int horsePower) {

		this.horsePower = horsePower;
	}

	public int getHorsePower() {

		return this.horsePower;
	}
}
