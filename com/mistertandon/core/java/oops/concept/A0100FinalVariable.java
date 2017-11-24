package com.mistertandon.core.java.oops.concept;

public class A0100FinalVariable {

	public static void main(String[] args) {

		ChildI childObj = new ChildI();
		childObj.conceptMessage();
	}
}

class ParentI {

	final int age = 5;

	/**
	 * Note: Invalid statement, final variable can be initialized once.
	 * 
	 * age = 8;
	 */
}

class ChildI extends ParentI {

	public void conceptMessage() {

		System.out.println("Final variable can be initialized once, variable \'age\' is: " + age);
	}
}