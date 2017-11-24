package com.mistertandon.core.java.oops.concept;

public class A0140AnonymousObject {

	public static void main(String[] args) {

		ClassV classV = new ClassV();
		classV.showMessage();
	}
}

class ClassV {

	public void showMessage() {

		System.out.println(
				"FUNCTION gets called from ANONYMOUS object. \nObject creation without storing in Reference variable is called Object creation.");
	}
}
