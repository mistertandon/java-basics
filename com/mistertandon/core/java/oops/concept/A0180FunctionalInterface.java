package com.mistertandon.core.java.oops.concept;

public class A0180FunctionalInterface {

	public static void main(String[] main) {

		PhoneBuildIV<String> phoneBuildObj = () -> {

			return "Motorola Moto G Turbo Operating system base is Android 5.1.1";
		};

		System.out.println(phoneBuildObj.operatingSystem());
	}
}

interface PhoneBuildIV<T> {

	public T operatingSystem();
}
