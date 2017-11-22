package com.mistertandon.core.java.basic.programs;

public class A00181PatternII {

	public static void main(String[] args) {

		int outerLoopLimit, innerLoopLimit;

		outerLoopLimit = innerLoopLimit = 5;

		for (int outerLoopInit = 1; outerLoopInit <= outerLoopLimit; outerLoopInit++) {

			for (int innerLoopInit = 1; innerLoopInit <= outerLoopInit; innerLoopInit++) {

				System.out.print("* ");
			}

			System.out.println("");

		}
	}
}
