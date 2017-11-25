package com.mistertandon.core.java.oops.concept;

public class A0163InterfaceDefaultMethodII {

	public static void main(String[] args) {

		JioI jioIObj = new JioI();

		jioIObj.operatingSystem();
		jioIObj.ramInfo();
		jioIObj.romInfo();
	}

}

interface PhoneBuildVI {

	public abstract void ramInfo();

	default void operatingSystem() {

		System.out.println("Motorola Moto G Turbo Operating system base is Android 5.1.1");
	}
}

interface PhoneBuildVII {

	public abstract void romInfo();

	default void operatingSystem() {

		System.out.println("Motorola Moto G Turbo Operating system base is Android 5.1.1");
	}
}

class JioI implements PhoneBuildVI, PhoneBuildVII {

	public void ramInfo() {

		System.out.println("Motorola Moto G Turbo RAM is of 1 GB.");
	}

	public void romInfo() {

		System.out.println("Motorola Moto G Turbo ROM is of 16 GB.");
	}

	public void operatingSystem() {

		System.out.println("Motorola Moto G Turbo Operating system base is Android 5.1.1");
	}

}