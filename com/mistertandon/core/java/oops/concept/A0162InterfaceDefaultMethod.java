package com.mistertandon.core.java.oops.concept;

public class A0162InterfaceDefaultMethod {

	public static void main(String[] args) {

		Jio jioObj = new Jio();

		System.out.println(jioObj.operatingSystem());
	}

}

interface PhoneBuildV {

	default String operatingSystem() {

		return "Motorola Moto G Turbo Operating system base is Android 5.1.1";
	}
}

class Jio implements PhoneBuildV {

}