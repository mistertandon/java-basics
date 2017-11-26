package com.mistertandon.core.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A0010CollectionArrayListIterator {

	public static void main(String[] args) throws Exception {

		Collection hetroArray = new ArrayList();

		hetroArray.add("parvesh");
		hetroArray.add(6);
		hetroArray.add(6.15f);

		Iterator iteratorObj = hetroArray.iterator();

		while (iteratorObj.hasNext()) {

			System.out.println(iteratorObj.next());
		}
	}

}
