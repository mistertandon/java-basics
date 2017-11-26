package com.mistertandon.core.java.array;

public class A00200ArrayOfObject {

	public static void main(String[] args) {

		Object objectObj[] = new Object[2];

		objectObj[0] = "Parvesh";
		objectObj[1] = 29;

		System.out.println("Object type array can have any type of element.");
		System.out.printf("String type value at index 0: %s \n", objectObj[0]);
		System.out.printf("String type value at index 1: %d \n", objectObj[1]);
	}
}
