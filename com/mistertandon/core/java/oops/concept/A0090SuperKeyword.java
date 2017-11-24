package com.mistertandon.core.java.oops.concept;

public class A0090SuperKeyword {

	public static void main(String[] args) {

		Sub subObj = new Sub();
		subObj.show();
	}

}

class Super {

	public void show() {

		System.out.println("Super class SHOW method called.");
	}
}

class Sub extends Super {

	public void show() {

		super.show();
		System.out.println("Sub class SHOW method called.");
	}
}
