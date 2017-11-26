package com.mistertandon.core.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class A0011CollectionArrayListEnhanceForLoop {

	public static void main(String[] args) throws Exception {

		Collection hetroArray = new ArrayList();

		hetroArray.add("parvesh");
		hetroArray.add(6);
		hetroArray.add(6.15f);

		for (Object value : hetroArray) {

			System.out.println("Element value is: " + value);
		}
	}
}
