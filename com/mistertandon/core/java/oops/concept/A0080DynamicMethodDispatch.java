package com.mistertandon.core.java.oops.concept;

public class A0080DynamicMethodDispatch {

	public static void main(String[] args) {

		Derived derivedRef;

		Base baseObj = new Base();
		Derived derivedObj = new Derived();

		baseObj.show();
		derivedObj.show();

		derivedRef = derivedObj;
		derivedRef.show();
	}

}

class Base {

	public void show() {

		System.out.println("Base class \'show\' method called.");
	}
}

class Derived extends Base {

	public void show() {

		System.out.println("Derived class \'show\' method called.");
	}
}