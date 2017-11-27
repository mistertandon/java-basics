package com.mistertandon.core.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class A0012CollectionIntegerType {

	public static void main(String[] args) throws Exception {

		Collection<Integer> hetroArray = new ArrayList<Integer>();

		hetroArray.add(6);
		hetroArray.add(2);
		hetroArray.add(1988);

		for (Object value : hetroArray) {

			System.out.println("Element value is: " + value);
		}
	}

}
