package com.mistertandon.core.java.oops.concept;

public class A0110FinalMethod {

	public static void main(String[] args) {

		ChildII childIIObj = new ChildII();
		childIIObj.displayAge();
	}

}

class ParentII {

	protected int age = 6;

	final public void displayAge() {

		System.out.println("FUNCTION with FINAL keyword can not be override in DERIVED OR CHILD or SUB class");
	}
}

class ChildII extends ParentII {

	/**
	 * Note: Invalid method declaration
	 * 
	 * public void displayAge() {
	 * 
	 * System.out.println("Function with FINAL keyword can not be override in
	 * DERIVED OR CHILD or SUB class"); }
	 */

}
