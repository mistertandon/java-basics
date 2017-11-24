package com.mistertandon.core.java.oops.concept;

public class A0120FinalClass {

	public static void main(String[] args) {

		ParentIII parentIIIObj = new ParentIII();
		parentIIIObj.displayInfo();
	}

}

final class ParentIII {

	public void displayInfo() {

		System.out.println("CLASS with FINAL keyword can not be extend by DERIVED OR CHILD or SUB class");
	}
}

/**
 * Note: Following CLASS statement is Illegal as CLASS with FINAL keyword can
 * not be extended. class ChildIII extends ParentIII {
 * 
 * }
 */
