package com.mistertandon.core.java.oops.concept;

public class A0180FunctionalInterface {

	public static void main(String[] main) {

		PhoneBuildIV phoneBuildObj = () -> {

			System.out.println("Motorola Moto G Turbo Operating system base is Android 5.1.1");
		};

		phoneBuildObj.operatingSystem();
	}
}

interface PhoneBuildIV {

	public void operatingSystem();
}
