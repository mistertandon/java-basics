package com.mistertandon.core.java.oops.concept;

public class A0170AnonymousClass {

	public static void main(String[] args) {

		PhoneBuild phoneBuildObj = new PhoneBuild() {

			public void operatingSystem() {

				System.out.println("Motorola Moto G Turbo Operating system base is Android 5.1.1");
			}
		};

		phoneBuildObj.operatingSystem();
	}
}

interface PhoneBuild {

	public void operatingSystem();
}
