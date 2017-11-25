package com.mistertandon.core.java.oops.concept;

public class A0160Interface {

	public static void main(String[] args) {

		Motorola motorolaObj = new Motorola();

		motorolaObj.configuration();
		motorolaObj.operatingSystem();
	}
}

interface PhoneBuildI {

	public void configuration();
}

interface PhoneBuildII {

	public void operatingSystem();
}

class Motorola implements PhoneBuildI, PhoneBuildII {

	public void configuration() {

		System.out.println("Motorola Moto G Turbo having 16 GB R.O.M and 1 GB R.A.M");
	}

	public void operatingSystem() {

		System.out.println("Motorola Moto G Turbo Operating system base is Android 5.1.1");
	}
}
